package com.inventorymanagementsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.inventorymanagementsystem.exceptions.DuplicateItemException;
import com.inventorymanagementsystem.exceptions.InvalidQuantityException;

public class Inventory<T extends Item> {
    HashMap<String,T> items;

    public Inventory() {
        this.items = new HashMap<>();
    }

    public void add(T item) {
        if (item.getQuantity() < 0) {
            throw new InvalidQuantityException("Quantity cannot be negative");
        }

        if(items.containsKey(item.getId())) {
            throw new DuplicateItemException("Item already exists");
        }

        items.put(item.getId(), item);
    }

    public T remove(T item) {
        if(this.items.containsKey(item.getId())) {
            return this.items.remove(item.getId());
        }

        return null;
    }

    public T get(String id) {
        if(this.items.containsKey(id)){
            return this.items.get(id);
        }
        return null;
    }

    public List<T> getAll() {
        return new ArrayList<>(this.items.values());
    }
}
