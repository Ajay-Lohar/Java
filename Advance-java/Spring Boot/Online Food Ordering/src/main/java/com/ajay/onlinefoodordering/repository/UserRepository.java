package com.ajay.onlinefoodordering.repository;

import com.ajay.onlinefoodordering.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    public User findByEmail(String username );


}
