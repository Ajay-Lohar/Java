package com.ajay.springbootregloginapp.services;

import com.ajay.springbootregloginapp.entities.User;
import com.ajay.springbootregloginapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserServiceIMPL implements UserService{

    @Autowired
    public UserRepository userRepository;

    @Override
    public boolean registerUser(User user) {
        try {
            userRepository.save(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
}
