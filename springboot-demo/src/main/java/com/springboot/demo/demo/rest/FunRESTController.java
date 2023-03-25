package com.springboot.demo.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRESTController {
    @GetMapping("/Hello")
    public String welcomeMessage(){
        return "Hello World!";
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "run run run!";
    }

}
