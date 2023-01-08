package com.example.api_db.controller;

import com.example.api_db.entity.User;
import com.example.api_db.repository.UserRepository;
import com.example.api_db.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.api_db.repository.UserRepository;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List < User > getAllUsers() {
        return userService.findAll();
    }
}
