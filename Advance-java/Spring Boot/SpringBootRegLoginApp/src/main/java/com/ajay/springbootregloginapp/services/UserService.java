package com.ajay.springbootregloginapp.services;

import com.ajay.springbootregloginapp.entities.User;

public interface UserService {
    public boolean registerUser(User user);
    public User loginUser(String email, String password);
}
