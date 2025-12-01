package com.inventorymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Item book = new Book("bookid", "Java Concepts", 100, 10, "Akash Pal");
        Item clothes = new Clothes("bookid", "Java Concepts", 100, 10, "Akash Pal");

        List<Item> items = new ArrayList<Item>(
                List.of(
                        new Book("bookid", "Java Concepts", 100, 10, "Akash Pal"),
                        new Clothes("clothid", "Shirt", 1110, 5, "XL"),
                        new Electronics("elecid", "Fridge", 11101, 2, "2 years"),
                )
        );

        Inventory inventory = new Inventory();

        for (Item item : items) {
            inventory.add(item);
        }

    }
}
