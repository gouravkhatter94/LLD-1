package com.librarymanagementsystem;

import java.util.UUID;

abstract public class User {
    static int totalUsers = 0;
    private String userId;
    private String name;
    private String contactInfo;

    abstract void displayDashboard();
    abstract boolean canBorrowBooks();

    User(){
        userId = generateUniqueId();
        totalUsers++;
    }

    public String getUserId() {
        return userId;
    }

    User(String name, String contactInfo){
        this.userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
    }

    User(User user){
        this.userId = user.userId;
        this.name = user.name;
        this.contactInfo = user.contactInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    private final String generateUniqueId(){
        return UUID.randomUUID().toString();
    }

    public int getTotalUsers(){
        return totalUsers;
    }
}
