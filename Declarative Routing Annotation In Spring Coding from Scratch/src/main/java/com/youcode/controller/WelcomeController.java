package com.youcode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {

    @RequestMapping("/")
    public String Welcome(){
        return "welcome";
    }
    @RequestMapping(value = "/signup" ,method = RequestMethod.GET)
    public String singUp(){
        System.out.println("GET method");
        return "SignUpForm";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String singUpPost(){
        System.out.println("POST method");
        return "SignUpForm";
    }
}
