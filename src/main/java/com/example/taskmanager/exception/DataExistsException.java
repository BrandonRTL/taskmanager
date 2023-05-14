package com.example.taskmanager.exception;

public class DataExistsException extends RuntimeException{
    public DataExistsException(String message) {
        super(message);
    }
}
