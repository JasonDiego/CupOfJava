package com.springproj.CupOfJava;

import org.springframework.data.jpa.repository.JpaRepository;

/* extends Spring Data JPA's JpaRepository
 *  supports CRUD operations on Coffee records against a back end data store
 *  also includes: save(), findById(), findAll(), deleteById()
 */
public interface CoffeeRepository extends JpaRepository<Coffee, Long> {
}
