package com.example.ssm1.controller;


import com.example.ssm1.doman.User;
import com.example.ssm1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @Autowired
    public UserService userService;


    @RequestMapping(value = "/signIn", method = {RequestMethod.POST})
    public String signIn(User user, Model model){
        userService.signIn(user);
        model.addAttribute("user",user);
        return "home";
    }
}