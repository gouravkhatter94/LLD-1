package com.inventorymanagementsystem.orders;

import java.util.PriorityQueue;

public class OrderProcessor {
    PriorityQueue<Order> orders;

    public OrderProcessor() {
        this.orders = new PriorityQueue<>();
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public Order processOrder() {
        return this.orders.poll();
    }

    public int getSize() {
        return this.orders.size();
    }
}
