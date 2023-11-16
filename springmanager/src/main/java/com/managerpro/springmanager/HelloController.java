package com.managerpro.springmanager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController{

    @GetMapping("/")
    public String index(){
        return "Greeting form sping boot!";
    }

}