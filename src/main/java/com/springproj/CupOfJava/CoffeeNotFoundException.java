package com.springproj.CupOfJava;

public class CoffeeNotFoundException extends RuntimeException {

    CoffeeNotFoundException(Long id) {
        super("Coffee(id:" + id + ") not found!");
    }

}
