package com.codeclan.example.topdestinationslist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TopDestinationsTest {

    @Test
    public void getListTest() {
        TopDestinations topDestinations = new TopDestinations();
        assertEquals(20, topDestinations.getList().size());
    }

}
