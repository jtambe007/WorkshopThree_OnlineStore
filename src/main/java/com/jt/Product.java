package com.jt;

//  Create a Product class with appropriate getters, setters, constructors
//  and methods.
public class Product {
    private String id;
    private String name;
    private float price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "The product ID is " + id + '\'' + ". The product is called '" + name + '\'' + ", and it costs " + price;
    }

    public Product(String id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;


    }
}
