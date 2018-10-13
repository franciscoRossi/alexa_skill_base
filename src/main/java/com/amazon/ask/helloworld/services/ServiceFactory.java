package com.amazon.ask.helloworld.services;

import com.amazon.ask.helloworld.services.http.HttpService;

/**
 * Created by pupi on 13/10/18.
 */
public class ServiceFactory {
    private static ThreadLocal<HttpService> httpServiceInstance =ThreadLocal.withInitial(HttpService::new);
    private static ThreadLocal<DollarService> dollarServiceInstance =ThreadLocal.withInitial(DollarService::new);
    private static ThreadLocal<CoinMarketCapService> coinMarketCapServiceInstance=ThreadLocal.withInitial(CoinMarketCapService::new);


    public static HttpService getHttpService() {
        return httpServiceInstance.get();
    }
    public static DollarService getDollarService() {
        return dollarServiceInstance.get();
    }
    public static CoinMarketCapService getCoinMarketCapService() {
        return coinMarketCapServiceInstance.get();
    }
}
