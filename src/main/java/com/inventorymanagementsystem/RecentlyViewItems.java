package com.inventorymanagementsystem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RecentlyViewItems {
    LinkedList<Item> recentlyViewedItems;
    private final int MAX_SIZE = 3;

    public RecentlyViewItems() {
        this.recentlyViewedItems = new LinkedList<>();
    }

    public void addRecentlyViewedItem(Item item) {
        if(this.recentlyViewedItems.contains(item)) {
            this.recentlyViewedItems.remove(item);
        } else if(this.recentlyViewedItems.size() == MAX_SIZE) {
            this.recentlyViewedItems.removeLast();
        }
        this.recentlyViewedItems.addFirst(item);
    }

    public List<Item> getRecentlyViewedItems() {
        return new ArrayList<>((LinkedList<Item>) this.recentlyViewedItems.clone());
    }
}
