package com.amazon.ask.helloworld.api.dollar;

import com.amazon.ask.helloworld.api.AbstractApi;
import com.amazon.ask.helloworld.services.ServiceFactory;

public class DollarApi extends AbstractApi {
    private static final String API_URL = "http://ws.geeklab.com.ar/";

    public DollarApi() {

    }

    @Override
    public void executeRequest() {
        ServiceFactory.getHttpService().executeHttpRequest(this,
                API_URL);
    }
}
