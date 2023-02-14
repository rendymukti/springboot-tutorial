package com.springbootproject.Springboot.project.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    //	@RequestMapping(value = "/", method = RequestMethod.GET)
    @Value("${welcome.message}")
    private String welcomeMessages;

    @GetMapping("/")
    public String HelloWorld() {



        return welcomeMessages;
    }

}
