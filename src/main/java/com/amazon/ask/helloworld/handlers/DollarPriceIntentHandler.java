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
public class DollarPriceIntentHandler implements RequestHandler {
    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(Predicates.intentName("DollarPriceIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String value = Double.toString(ServiceFactory.getDollarService()
                .getMarketValue().getLibre());
        String speechText = "El precio actual del dólar es de " + value + " pesos argentinos.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("Precio del dólar", speechText)
                .build();
    }
}
