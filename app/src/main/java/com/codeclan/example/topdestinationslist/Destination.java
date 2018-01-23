package com.codeclan.example.topdestinationslist;

public class Destination {

    private Integer ranking;
    private String destination;
    private String country;

    public Destination(Integer ranking, String destination, String country) {
        this.ranking = ranking;
        this.destination = destination;
        this.country = country;
    }

    public Integer getRanking() {
        return this.ranking;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getCountry() {
        return this.country;
    }
}
