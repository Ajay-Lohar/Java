package com.ajay.springbootwebp1.repository;

import com.ajay.springbootwebp1.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserReporesitory  extends JpaRepository<User, Integer> {
        User findByEmail(String email);
}
