package com.cognizant.spring_learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.cognizant.spring_learn.Country;

@RestController
public class HelloController {

    // 1️⃣ Basic Hello World API
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!!";
    }

    // 2️⃣ Path Variable Example
    @GetMapping("/hello/{name}")
    public String sayHelloName(@PathVariable String name) {
        return "Hello " + name;
    }

    // 3️⃣ JSON Response Example
    @GetMapping("/country")
    public Country getCountry() {
        return new Country("IN", "India");
    }
}