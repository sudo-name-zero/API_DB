package com.example.api_db.service;

import com.example.api_db.entity.User;
import com.example.api_db.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {

        return (List<User>) userRepository.findAll();
    }
}
