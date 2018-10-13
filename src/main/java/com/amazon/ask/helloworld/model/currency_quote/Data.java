package com.amazon.ask.helloworld.model.currency_quote;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pupi on 14/10/18.
 */
public class Data {
    @JsonProperty("ETH")
    private ETH ETH;

    public Data() {
    }

    public com.amazon.ask.helloworld.model.currency_quote.ETH getETH() {
        return ETH;
    }

    public void setETH(com.amazon.ask.helloworld.model.currency_quote.ETH ETH) {
        this.ETH = ETH;
    }
}
