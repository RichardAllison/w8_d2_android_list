package com.codeclan.example.topdestinationslist;

import java.util.ArrayList;
import java.util.Collection;

public class TopDestinations {

    private ArrayList<Destination> topDestinations;

    public TopDestinations() {
        topDestinations = new ArrayList<>();
        topDestinations.add(new Destination(1,"Rome","Italy"));
        topDestinations.add(new Destination(2,"Paris","France"));
        topDestinations.add(new Destination(3,"New York","USA"));
        topDestinations.add(new Destination(4,"The Pyramids","Egypt"));
        topDestinations.add(new Destination(5,"Yellowstone National Park","USA"));
        topDestinations.add(new Destination(6,"Tokyo","Japan"));
        topDestinations.add(new Destination(7,"Beijing","China"));
        topDestinations.add(new Destination(8,"Niagara Falls","Canada"));
        topDestinations.add(new Destination(9,"Dubai","UAE"));
        topDestinations.add(new Destination(10,"Bangkok","Thailand"));
        topDestinations.add(new Destination(11,"Sydney","Australia"));
        topDestinations.add(new Destination(12,"Mallorca","Spain"));
        topDestinations.add(new Destination(13,"Lake District","England"));
        topDestinations.add(new Destination(14,"Isle of Skye","Scotland"));
        topDestinations.add(new Destination(15,"Dublin","Ireland"));
        topDestinations.add(new Destination(16,"San Juan","Puerto Rico"));
        topDestinations.add(new Destination(17,"Havana","Cuba"));
        topDestinations.add(new Destination(18,"Edinburgh","Scotland"));
        topDestinations.add(new Destination(19,"Hamburg","Germany"));
        topDestinations.add(new Destination(20,"London","England"));
    }

    public ArrayList<Destination> getList() {
        return new ArrayList<>(topDestinations);
    }
}
