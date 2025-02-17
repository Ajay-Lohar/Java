package com.ajay.springbootwebp1.services;

import com.ajay.springbootwebp1.entities.User;
import com.ajay.springbootwebp1.repository.UserReporesitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceIMPL implements UserService{

    @Autowired
    private UserReporesitory userReporesitory;

    @Override
    public boolean registerUser(User user) {
        try {
            userReporesitory.save(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;

        }
    }

    @Override
    public User loginUser(String email, String password) {

       User validUser =  userReporesitory.findByEmail(email);

       if (validUser != null && validUser.getPassword().equals(password)) {

           return validUser;
       }
        return null;
    }
}
