package com.amazon.ask.helloworld.model.currency_quote;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pupi on 14/10/18.
 */
public class Quote {
    @JsonProperty("USD")
    private USD USD;

    public Quote() {
    }

    public USD getUSD() {
        return USD;
    }

    public void setUSD(USD USD) {
        this.USD = USD;
    }
}
