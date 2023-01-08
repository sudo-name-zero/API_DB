package com.example.api_db;

import com.example.api_db.controller.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiDbApplication {

    public static void main(String[] args) {

        SpringApplication.run(ApiDbApplication.class, args);
    }

}
