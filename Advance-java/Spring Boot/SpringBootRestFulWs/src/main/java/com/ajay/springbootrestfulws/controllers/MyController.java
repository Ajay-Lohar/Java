package com.ajay.springbootrestfulws.controllers;


import com.ajay.springbootrestfulws.entities.User;
import com.ajay.springbootrestfulws.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private UserService userService;

    @PostMapping( "/user")
    public User addUserDeatils(@RequestBody User user) {

        return  userService.createUser(user);
    }

    @GetMapping ("/user")
    public List<User> getAllUserDetails() {
        return  userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserDetails(@PathVariable int id) {
     User user =   userService.getUserDetails(id).orElse(null);
     if (user != null) {
         return ResponseEntity.ok().body(user);
     }else {
         return ResponseEntity.notFound().build();

     }
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<User> UpdateUserDetails(@PathVariable int id , @RequestBody User user) {
       User updatedUser = userService.updateUserDetails(id, user);
       if (updatedUser != null) {
        return ResponseEntity.ok(updatedUser);  //line no 33 & 44 is same method
       }else {
           return ResponseEntity.notFound().build();
       }
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}
