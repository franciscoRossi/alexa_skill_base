package com.amazon.ask.helloworld.model.currency_quote;

/**
 * Created by pupi on 14/10/18.
 */
public class CurrencyQuoteResponseBody {
    private Data data;
    private Status status;

    public CurrencyQuoteResponseBody() {
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
