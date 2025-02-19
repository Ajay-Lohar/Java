package com.ajay.springbootregloginapp.controllers;

import com.ajay.springbootregloginapp.entities.User;
import com.ajay.springbootregloginapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {

    @Autowired
    private UserService userService;

    @GetMapping("/regPage")
    public String openRegPage(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/regForm")
    public String  submitRegForm(@ModelAttribute("user") User user , Model model) {
       boolean status = userService.registerUser(user);
       if (status) {
           model.addAttribute("SuccessMsg", "User registered successfully");
       }else {
           model.addAttribute("ErrorMsg", "User registration failed");
       }
        return "register";
    }
}
