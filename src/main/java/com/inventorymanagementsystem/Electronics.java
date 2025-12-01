package com.inventorymanagementsystem;

public class Electronics extends Item{
    private String warranty;

    public Electronics(String id, String name, int price, int quantity,
            String warranty) {
        super(id, name, price, quantity);
        this.warranty = warranty;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }
}
