package com.amazon.ask.helloworld.services;

import com.amazon.ask.helloworld.api.EthereumPriceEndpoint;
import com.amazon.ask.helloworld.model.currency_quote.CurrencyQuoteResponseBody;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Created by pupi on 14/10/18.
 */
public class CoinMarketCapService {
    private static ObjectMapper mapper = new ObjectMapper();

    public CurrencyQuoteResponseBody getEthereumInfo() {
        EthereumPriceEndpoint endpoint = new EthereumPriceEndpoint();
        endpoint.executeRequest();

        if (ServiceFactory.getHttpService().getLastResponse().getCode() == 200) {
            String responseStr = ServiceFactory.getHttpService().getLastResponse().getBody();
            try {
                return mapper.readValue(responseStr, CurrencyQuoteResponseBody.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
