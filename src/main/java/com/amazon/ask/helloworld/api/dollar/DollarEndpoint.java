package com.amazon.ask.helloworld.api.dollar;

import com.amazon.ask.helloworld.api.dollar.DollarApi;

/**
 * Created by pupi on 13/10/18.
 */
public class DollarEndpoint extends DollarApi {
    public DollarEndpoint() {
        super();
        setMethod("GET");
        setPath("dollar/get-dollar-json.php");
    }
}
