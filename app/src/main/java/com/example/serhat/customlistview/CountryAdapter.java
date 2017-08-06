package com.example.serhat.customlistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Serhat on 8/6/17.
 */

public class CountryAdapter  extends ArrayAdapter<CountryClass>{


    private CountryClass[] countryList;
    private int resource;


    public CountryAdapter(Context context, int resource, CountryClass[] countryList) {
        super(context, resource, countryList);
        this.resource = resource;
        this.countryList= countryList;

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View line;
        LayoutInflater  layoutInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        line = layoutInflater.inflate(resource,null);

        TextView name = (TextView)line.findViewById(R.id.textView);
        TextView capital = (TextView)line.findViewById(R.id.textView2);
        ImageView flag = (ImageView)line.findViewById(R.id.imageView);

        CountryClass countries = countryList[position];
        name.setText(countries.getName());
        capital.setText(countries.getCapital());
        flag.setImageResource(countries.getFlag());

        return line;

    }
}
