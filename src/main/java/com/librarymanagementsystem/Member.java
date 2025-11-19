package com.librarymanagementsystem;

public class Member extends User {
    private int borrowedBooksCount;
    private final int MAX_BORROW_LIMIT = 5;

    Member() {
        super();
    }
    Member(String name, String contactInfo, int borrowedBooksCount) {
        super(name, contactInfo);
        this.borrowedBooksCount = borrowedBooksCount;
    }
    Member(Member member) {
        super(member.getName(), member.getContactInfo());
        this.borrowedBooksCount = member.borrowedBooksCount;
    }

    void displayDashboard(){
        System.out.println("Member Dashboard");
        System.out.println("Books Borrowed: " + this.borrowedBooksCount);
    }

    boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }

    String generateUniqueId() {
        return "nbvbng";
    }
}
