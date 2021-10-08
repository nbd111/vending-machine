package com.techelevator;

public class Products {

    private final String id;
    private final double price;
    private final String type;

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    Products(String id, double price, String type){
        this.id = id;
        this.price = price;
        this.type = type;


    }
}