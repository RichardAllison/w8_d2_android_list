package com.codeclan.example.topdestinationslist;

public class Destination {

    private Integer ranking;
    private String city;
    private String country;

    public Destination(Integer ranking, String city, String country) {
        this.ranking = ranking;
        this.city = city;
        this.country = country;
    }

    public Integer getRanking() {
        return this.ranking;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }
}
