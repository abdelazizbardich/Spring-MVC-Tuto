package com.youcode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

    @RequestMapping("/")
    public String Welcome(){
        return "welcome";
    }
    @GetMapping("/products")
    public String getProductByCategory(
//            @RequestParam String catId // variable name is same as url param name
//            @RequestParam("cat_Id") String categoryId // variable name is not same as url param name  (name passed to RequestParam used instead)
//            @RequestMapping(value = "cat_id",required = false) String categoryId // Optional
            @RequestMapping(value = "cat_id",required = false,defaultValue = "0") String categoryId // Optional with a def
    ){
        return "products";
    }
}
