package com.example.api_db.repository;

import com.example.api_db.entity.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Long> {
}
