package com.gsb.simpleWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HomeController {

    @RequestMapping("/")
//    @ResponseBody // Either use this or instead of @Controller use @RestController
    public String greet() {
        return "Samraat GSB";
    }

}
