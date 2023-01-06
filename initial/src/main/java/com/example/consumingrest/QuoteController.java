package com.example.consumingrest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.client.RestTemplate;

@RestController
public class QuoteController {

    @GetMapping("/quote")
    public Quote quote(RestTemplate restTemplate, @RequestParam(value = "name", defaultValue = "Dandan" +
            "") String name) {
        Quote getQuote = restTemplate.getForObject(
                    "http://localhost:8080/api/random", Quote.class);
        assert getQuote != null;
        Quote quote = new Quote(getQuote.getType(),getQuote.getValue());
        quote.getValue().setName(name);
        return quote;
    };
}

