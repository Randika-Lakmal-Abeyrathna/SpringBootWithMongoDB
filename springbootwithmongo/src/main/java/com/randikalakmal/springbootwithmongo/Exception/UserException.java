package com.randikalakmal.springbootwithmongo.Exception;

public class UserException extends RuntimeException{
    public UserException(String message) {
        super(message);
    }
}
