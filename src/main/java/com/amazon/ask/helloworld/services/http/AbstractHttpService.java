package com.amazon.ask.helloworld.services.http;


import com.amazon.ask.helloworld.api.AbstractApi;
import com.amazon.ask.helloworld.model.BasicResponse;
import okhttp3.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by pupi on 23/05/18.
 */
public abstract class AbstractHttpService {
    private OkHttpClient client;
    private BasicResponse lastResponse;

    protected void initializeHttpClient() {
        OkHttpClient.Builder builder;
        builder = new OkHttpClient.Builder();
        builder.connectTimeout(30, TimeUnit.SECONDS);
        client = builder.build();
    }

    public void executeHttpRequest(AbstractApi endpoint, String baseUrl) {
        Request request = null;
        Headers.Builder headerBuilder = new Headers.Builder();
        endpoint.getHeaders().forEach(headerBuilder::add);

        if (endpoint.getMethod().equals("GET") || endpoint.getMethod().equalsIgnoreCase("DELETE")) {
            request = new Request.Builder()
                    .url(baseUrl + endpoint.getPath())
                    .method(endpoint.getMethod(), null)
                    .headers(headerBuilder.build())
                    .build();
        }
        else if (endpoint.getMethod().equals("POST") || endpoint.getMethod().equals("PUT")) {
            RequestBody body = RequestBody.create(MediaType.parse("application/json"), endpoint.getBody());
            request = new Request.Builder()
                    .url(baseUrl + endpoint.getPath())
                    .method(endpoint.getMethod(), body)
                    .headers(headerBuilder.build())
                    .build();
        }

        if (request != null ) {
            try {
                Response response = getHttpClient().newCall(request).execute();
                BasicResponse resp = new BasicResponse(response.code(), response.body().string());
                endpoint.getResponses().add(resp);
                lastResponse = resp;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    private OkHttpClient getHttpClient() {
        return client;
    }

    public BasicResponse getLastResponse() {
        return lastResponse;
    }
}