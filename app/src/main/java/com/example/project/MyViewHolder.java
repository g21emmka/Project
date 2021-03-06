package com.example.project;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.widget.TextView;

        public class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView name;
        public TextView location;
        public TextView info;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.animal_name);
            location = itemView.findViewById(R.id.animal_location);
            info = itemView.findViewById(R.id.animal_size);
        }
    }

