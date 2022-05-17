package com.example.project;

public class Animals {


    private String ID;
    private String name;
    private String type;
    private String company;
    private String location;
    private String category;
    private int size;
    private int cost;
    private String auxdata;

    public Animals(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    };

    public String getLocation() {
        return location;
    }

    public String getAuxdata() {
        return auxdata;
    }
}
