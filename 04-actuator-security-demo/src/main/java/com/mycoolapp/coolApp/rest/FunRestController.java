package com.mycoolapp.coolApp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String sayHello(){
        return "hello";
    }

//expose a new end point for "workout"
    @GetMapping("/workout")
    public String dailyWorkout(){
        return "should i join way 2 fitness or not";
    }

}
