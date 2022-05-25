package com.example.project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter <MyViewHolder> {

    List<Animals> animals = new ArrayList<>();

    public void setAnimals(List<Animals> animals) {
        this.animals = animals;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.animals, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.name.setText(animals.get(position).getName());
        holder.location.setText(animals.get(position).getLocation());
        holder.info.setText(animals.get(position).getAuxdata());
    }

    @Override
    public int getItemCount() {
        return animals.size();
    }
}