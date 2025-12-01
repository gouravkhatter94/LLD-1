package com.inventorymanagementsystem;

public class Clothes extends Item{
    private String size;

    public Clothes(String id, String name, int price, int quantity,
            String size) {
        super(id, name, price, quantity);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
