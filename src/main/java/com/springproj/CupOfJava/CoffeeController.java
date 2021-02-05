package com.springproj.CupOfJava;

import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

@RestController
public class CoffeeController {

    private static final Logger log = LoggerFactory.getLogger(CoffeeController.class);

    private final CoffeeRepository repository;


    CoffeeController(CoffeeRepository repository) {
        this.repository = repository;
    }


    // GET: RETURN ALL COFFEE OBJS IN CART
    @GetMapping("/cart")
    List<Coffee> all() {
        return repository.findAll();
    }

    // GET: RETURN COFFEE SPECIFIED BY ID
    @GetMapping("/cart/{id}")
    Coffee one(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new CoffeeNotFoundException(id));
    }

    // GET: PRINT NUMBER OF CART ITEMS
    @GetMapping("/cart/total")
    Long total() {
        return repository.count();
    }


    // POST: ADD NEW COFFEE OBJ TO CART, PROVIDED IN RESPONSE BODY
    @PostMapping("/cart")
    Coffee newCoffee(@RequestBody Coffee newCoffee) {
        return repository.save(newCoffee);
    }


    // DELETE: DELETE COFFEE OBJ SPECIFIED BY ID
    @DeleteMapping("/cart/{id}")
    void deleteCoffee(@PathVariable Long id) {
        repository.deleteById(id);
    }

    // DELETE: DELETE ALL ITEMS IN CART
    @DeleteMapping("/cart")
    void deleteCoffee() {
        repository.deleteAll();
    }

}
