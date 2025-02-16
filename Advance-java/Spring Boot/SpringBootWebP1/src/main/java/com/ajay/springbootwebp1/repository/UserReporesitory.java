package com.ajay.springbootwebp1.repository;

import com.ajay.springbootwebp1.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReporesitory  extends JpaRepository<User, Integer> {

}
