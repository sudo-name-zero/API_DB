package com.example.api_db.controller;

import com.example.api_db.entity.User;
import com.example.api_db.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/getall")
    public List getAllUsers() {
        return service.listAll();
    }

    @GetMapping("/getby/{id}")
    public User getUserById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PostMapping("/createuser")
    public User createUser(@RequestBody User user) {

        return service.save(user);
    }

    @DeleteMapping("/deleteuser{id}")
    public void deleteUser(@RequestBody Integer id) {
        service.delete(id);
    }

}

