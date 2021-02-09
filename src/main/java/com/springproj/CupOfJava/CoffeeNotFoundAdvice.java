package com.springproj.CupOfJava;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class CoffeeNotFoundAdvice {

    @ResponseBody // advice is rendered into response body
    @ExceptionHandler(CoffeeNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND) // issues an HTTP 404 status code
    String coffeeNotFoundHandler(CoffeeNotFoundException ex) {
        return ex.getMessage();
    }
}
