package com.codeclan.example.topdestinationslist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DestinationTest {

    Destination destination;

    @Before
    public void before() {
        destination = new Destination(4, "Venice", "Italy");
    }

    @Test
    public void getRankingTest() {
        assertEquals((Integer)4, destination.getRanking());
    }

    @Test
    public void getCityTest() {
        assertEquals("Venice", destination.getDestination());
    }

    @Test
    public void getCountryTest() {
        assertEquals("Italy", destination.getCountry());
    }

}
