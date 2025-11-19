package com.librarymanagementsystem;

import java.awt.print.Book;

public class Librarian extends User{
    private String employeeNumber;

    void displayDashboard(){
        System.out.println("Librarian Dashboard");
        System.out.println("Employee Number: " + employeeNumber);
    }

    boolean canBorrowBooks(){
        return true;
    }

//    void addNewBook(Book book){}

//    void removeBook(Book book){}
}
