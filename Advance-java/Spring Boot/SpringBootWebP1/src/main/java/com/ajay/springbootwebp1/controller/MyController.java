package com.ajay.springbootwebp1.controller;

import com.ajay.springbootwebp1.entities.User;
import com.ajay.springbootwebp1.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
public class MyController {

    @Autowired
    private UserService userService;

    @GetMapping("/regPage")
    public  String openRegPage(Model model){
        model.addAttribute("user",new User());
        return "register";
    }

    @PostMapping("/regForm")
    public String submitRegPage(@ModelAttribute("user") User user, Model model){

      boolean status =  userService.registerUser(user);
      if (status){
          model.addAttribute("successMsg", "User registered successfully" );
      }else {
          model.addAttribute("errorMsg", "User could not be registered" );
      }
      return "register";
      }
}


