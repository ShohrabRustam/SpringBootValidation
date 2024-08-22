package com.example.Curl.exception;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String massage){
        super(massage);
    }
}
