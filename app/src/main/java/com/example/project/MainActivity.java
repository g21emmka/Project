package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener{

    RecyclerView recyclerView;

    private MyAdapter adapter;

    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=g21emmka";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new MyAdapter();
        new JsonTask(this).execute(JSON_URL);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager( this));
    }

    @Override
    public void onPostExecute(String json) {
        Gson gson = new Gson();
        Animals animals[];
        animals = gson.fromJson(json, Animals[].class);
        List<Animals> newAnimals = new ArrayList<>();

        for (int i = 0; i < animals.length; i++) {
            Log.d("MainActivity ==>", "Hittade ett djur:" +animals[i].getName());
            newAnimals.add(animals[i]);
        }

        Log.d("MainActivity", json);
        adapter.setAnimals(newAnimals);
        adapter.notifyDataSetChanged();
    }

    }
