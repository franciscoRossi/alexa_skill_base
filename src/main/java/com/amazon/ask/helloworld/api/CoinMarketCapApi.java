package com.amazon.ask.helloworld.api;

import com.amazon.ask.helloworld.services.ServiceFactory;

/**
 * Created by pupi on 14/10/18.
 */
public class CoinMarketCapApi extends AbstractApi {
    public CoinMarketCapApi() {
        super();
        getHeaders().put("X-CMC_PRO_API_KEY", "");
    }

    @Override
    public void executeRequest() {
        //TODO: Change this hardcoded url
        ServiceFactory.getHttpService().executeHttpRequest(this,
                "https://pro-api.coinmarketcap.com/");

    }
}
