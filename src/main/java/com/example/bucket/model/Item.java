package com.example.bucket.model;

public class Item {

    private int id;

    public Item(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "ID - " + id + ".";
    }
}
