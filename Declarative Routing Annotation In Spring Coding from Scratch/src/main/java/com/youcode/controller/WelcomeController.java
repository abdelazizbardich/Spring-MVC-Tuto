package com.youcode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("/user") // prefix all request mapping on this controller with "/user"
@RequestMapping(value = {"/user","/admin"}) // to use this controller with more than url
public class WelcomeController {

    @RequestMapping("/")
    public String Welcome(){
        return "welcome";
    }
//    @RequestMapping(value = "/signup" ,method = RequestMethod.GET)
//    @GetMapping("/signup")
    @GetMapping({"/signup","/register"}) // to use this controller with more than url
    public String singUp(){
        System.out.println("GET method called");
        return "SignUpForm";
    }

//    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    @PostMapping("/signup")
    public String singUpPost(){
        System.out.println("POST method called");
        return "SignUpForm";
    }
}
