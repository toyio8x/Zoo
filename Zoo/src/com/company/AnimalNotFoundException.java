package com.company;

public class AnimalNotFoundException extends RuntimeException {
    public AnimalNotFoundException(String s) {
        super(s);
    }
}
