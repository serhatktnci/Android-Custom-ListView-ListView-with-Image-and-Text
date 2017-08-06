package com.example.serhat.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView)findViewById(R.id.listView);

        CountryClass[] countries = new CountryClass[]{
                new CountryClass("Turkey", "Ankara",R.drawable.turkey),
                new CountryClass("Turkey", "Ankara",R.drawable.turkey),
                new CountryClass("Turkey", "Ankara",R.drawable.turkey),
                new CountryClass("Turkey", "Ankara",R.drawable.turkey),
                new CountryClass("Turkey", "Ankara",R.drawable.turkey),
                new CountryClass("Turkey", "Ankara",R.drawable.turkey),
                new CountryClass("Turkey", "Ankara",R.drawable.turkey),
                new CountryClass("Turkey", "Ankara",R.drawable.turkey),

        };

        CountryAdapter adapter = new CountryAdapter(this,R.layout.customlist,countries);
        lv.setAdapter(adapter);
    }
}
