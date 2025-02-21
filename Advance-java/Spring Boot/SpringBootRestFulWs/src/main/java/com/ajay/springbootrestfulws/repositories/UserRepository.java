package com.ajay.springbootrestfulws.repositories;

import com.ajay.springbootrestfulws.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {



}
