package com.example.cinemaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class secondary extends AppCompatActivity {
    String film[] = {"Spiderman","Batman","Titanic","Flash"};
    ListView lvFilm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        Intent i = getIntent();

        lvFilm = (ListView) findViewById(R.id.lvFilm);
        ArrayAdapter<String> aaFilm = new ArrayAdapter<String>(this, R.layout.activity_main, film);
        lvFilm.setAdapter(aaFilm);

        lvFilm.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                String titolo = (String) lvFilm.getItemAtPosition(i);
            }
        });
    }
}