package com.mycoolapp.coolApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //injecting custom properties
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    //expose new endpoint for team info.
    @GetMapping("/teaminfo")
    public  String getTeamInfo(){
        return "Coach:"+coachName+" Team: "+teamName;
    }


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
