package com.codeclan.example.topdestinationslist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TopDestinationsAdapter extends ArrayAdapter<Destination> {

    public TopDestinationsAdapter(Context context, ArrayList<Destination> destinations) {
        super(context,0,destinations);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.destination, parent, false);
        }

        Destination currentDestination = getItem(position);

        TextView ranking = listItemView.findViewById(R.id.ranking);
        ranking.setText(currentDestination.getRanking().toString());

        TextView destination = listItemView.findViewById(R.id.destination);
        destination.setText(currentDestination.getDestination());

        TextView country = listItemView.findViewById(R.id.country);
        country.setText(currentDestination.getCountry().toString());

        return listItemView;
    }

}
