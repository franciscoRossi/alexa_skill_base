package com.amazon.ask.helloworld.api;

/**
 * Created by pupi on 13/10/18.
 */
public class DollarEndpoint extends AbstractApi {
    public DollarEndpoint() {
        super();
        setMethod("GET");
        setPath("dolar/get-dolar-json.php");
    }
}
