package com.amazon.ask.helloworld.api.coinmarketcap;

import com.amazon.ask.helloworld.api.AbstractApi;
import com.amazon.ask.helloworld.services.ServiceFactory;

/**
 * Created by pupi on 14/10/18.
 */
public class CoinMarketCapApi extends AbstractApi {
    private static final String API_URL = "https://pro-api.coinmarketcap.com/";

    public CoinMarketCapApi() {
        super();
        getHeaders().put("X-CMC_PRO_API_KEY", "");
    }

    @Override
    public void executeRequest() {
        //TODO: Change this hardcoded url
        ServiceFactory.getHttpService().executeHttpRequest(this,
                API_URL);

    }
}
