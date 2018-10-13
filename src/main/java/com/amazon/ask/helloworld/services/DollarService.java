package com.amazon.ask.helloworld.services;

import com.amazon.ask.helloworld.api.DollarEndpoint;
import com.amazon.ask.helloworld.model.DollarResponseBody;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Created by pupi on 13/10/18.
 */
public class DollarService {
    private static ObjectMapper mapper = new ObjectMapper();

    public DollarResponseBody getMarketValue() {
        DollarEndpoint endpoint = new DollarEndpoint();
        endpoint.executeRequest();

        if (ServiceFactory.getHttpService().getLastResponse().getCode() == 200) {
            String responseStr = ServiceFactory.getHttpService().getLastResponse().getBody();
            try {
                return mapper.readValue(responseStr, DollarResponseBody.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
