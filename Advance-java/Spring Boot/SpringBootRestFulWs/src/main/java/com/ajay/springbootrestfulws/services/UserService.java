package com.ajay.springbootrestfulws.services;

import com.ajay.springbootrestfulws.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public User createUser(User user) ;
    public List<User> getAllUsers();
    public Optional<User>    getUserDetails(int id);
    public User updateUserDetails (int id , User user);
    public void deleteUser(int id);
}
