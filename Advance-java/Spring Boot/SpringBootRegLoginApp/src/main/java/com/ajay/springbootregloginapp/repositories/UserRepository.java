package com.ajay.springbootregloginapp.repositories;

import com.ajay.springbootregloginapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
      User findByEmail(String email);

}
