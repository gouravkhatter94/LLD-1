package com.inventorymanagementsystem.exceptions;

public class DuplicateItemException extends RuntimeException {
    public DuplicateItemException(String message){
        super(message);
    }
}
