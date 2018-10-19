package com.amazon.ask.helloworld.api.galicia;

import com.amazon.ask.helloworld.api.AbstractApi;
import com.amazon.ask.helloworld.services.ServiceFactory;

public class GaliciaApi extends AbstractApi {
    private static final String API_KEY = "test";
    private static final String API_URL = "https://api-2445582606955.production.gw.apicast.io/";

    public GaliciaApi() {
        super();
    }

    @Override
    public void executeRequest() {
        ServiceFactory.getHttpService().executeHttpRequest(this,
                API_URL);
    }

    protected void appendApiKey() {
        this.setPath(this.getPath() + "?apikey=" + API_KEY);
    }
}