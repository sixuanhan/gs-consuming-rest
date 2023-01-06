package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

    private Long id;
    private String quote;
    private String name;


    public Value() {name = "dandan";}

    public Long getId() {
        return this.id;
    }

    public String getQuote() {
        return this.quote;
    }

    public String getName() {return this.name;}

    public void setId(Long id) {
        this.id = id;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public void setName(String name) {this.name = name;}

    @Override
    public String toString() {
        return "Value{" +
                "id=" + id +
                ", quote='" + quote + '\'' +
                ", name=" + name +
                '}';
    }
}