package com.youcode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    @RequestMapping("/")
    public String Welcome(){
        return "welcome";
    }


    @GetMapping("/products/{id}")
    public String getProductByCategory(
            @PathVariable String id
//            @PathVariable("id") String ProductId
    ){
        System.out.println("id: "+id);
//        System.out.println("id: "+ProductId);
        return "products";
    }
}
