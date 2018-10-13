package com.amazon.ask.helloworld.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.helloworld.services.ServiceFactory;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

import java.util.Optional;

/**
 * Created by pupi on 14/10/18.
 */
public class EthereumPriceIntentHandler implements RequestHandler {
    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(Predicates.intentName("EthereumPriceIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String value = Double.toString(ServiceFactory.getCoinMarketCapService()
                .getEthereumInfo().getData().getETH().getQuote().getUSD().getPrice());
        String speechText = "El precio actual del ethereum es de " + value + " dólares.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("Precio del ethereum", speechText)
                .build();
    }
}
