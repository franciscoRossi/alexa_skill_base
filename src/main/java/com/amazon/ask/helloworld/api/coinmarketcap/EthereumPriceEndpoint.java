package com.amazon.ask.helloworld.api.coinmarketcap;

/**
 * Created by pupi on 14/10/18.
 */
public class EthereumPriceEndpoint extends CoinMarketCapApi {
    public EthereumPriceEndpoint() {
        super();
        setMethod("GET");
        setPath("v1/cryptocurrency/quotes/latest?symbol=ETH");
    }
}
