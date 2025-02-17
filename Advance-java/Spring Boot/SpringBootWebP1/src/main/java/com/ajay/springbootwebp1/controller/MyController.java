package com.ajay.springbootwebp1.controller;

import com.ajay.springbootwebp1.entities.User;
import com.ajay.springbootwebp1.services.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
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

      @GetMapping("/loginPage")
      public String openLoginPage (Model model){
        model.addAttribute("user",new User());
        return "login";

      }


      @PostMapping("loginForm")
      public String submitLoginForm(@ModelAttribute("user") User user , Model model){
       User validUser =  userService.loginUser(user.getEmail(), user.getPassword());
       if (validUser != null){
           model.addAttribute("modelName", validUser.getName());
           return "profile";
       }else {
           model.addAttribute("errorMsg", "Email Id or Password is incorrect" );
           return "login";
       }

      }
        @GetMapping("/logout")
      public String logoutUser(HttpServletRequest request){
        HttpSession session = request.getSession(false);
        if (session != null){
            session.invalidate();

        }
        return "login";
      }
}


