package com.amazon.ask.helloworld.api;

import com.amazon.ask.helloworld.model.BasicResponse;
import com.amazon.ask.helloworld.services.ServiceFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by pupi on 22/05/18.
 */
public abstract class AbstractApi {
    private static ThreadLocal<String> httpMethod = new ThreadLocal<>();
    private static ThreadLocal<String> path = new ThreadLocal<>();
    private static ThreadLocal<String> body = new ThreadLocal<>();
    private static ThreadLocal<Map<String, String>> headers = new ThreadLocal<>();
    private static ThreadLocal<ArrayList<BasicResponse>> responses = new ThreadLocal<>();

    protected AbstractApi() {
        headers.set(new HashMap<>());
        responses.set(new ArrayList<>());
    }

    public String getMethod() {
        return httpMethod.get();
    }

    public void setMethod(String method) {
        httpMethod.set(method);
    }

    public String getPath() {
        return path.get();
    }

    public void setPath(String p) {
        path.set(p);
    }

    public String getBody() {
        return body.get();
    }

    public void setBody(String b) {
        body.set(b);
    }

    public ArrayList<BasicResponse> getResponses() {
        return responses.get();
    }

    public synchronized BasicResponse getLastResponse() {
        return getResponses().get(getResponses().size() - 1);
    }

    public void setResponses(ArrayList<BasicResponse> respons) {
        responses.set(respons);
    }

    public Map<String, String> getHeaders() {
        return headers.get();
    }

    public void setHeaders(Map<String, String> h) {
        headers.set(h);
    }

    public void executeRequest() {
        //TODO: Change this hardcoded url
        ServiceFactory.getHttpService().executeHttpRequest(this,
                "http://ws.geeklab.com.ar/");
    }
}
