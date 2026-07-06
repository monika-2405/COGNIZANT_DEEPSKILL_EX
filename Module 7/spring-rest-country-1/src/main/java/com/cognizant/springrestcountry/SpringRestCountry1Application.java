package com.cognizant.springrestcountry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:country.xml")
public class SpringRestCountry1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringRestCountry1Application.class, args);
    }
}