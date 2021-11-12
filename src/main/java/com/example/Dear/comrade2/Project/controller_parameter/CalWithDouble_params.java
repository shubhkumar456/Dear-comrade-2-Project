package com.example.Dear.comrade2.Project.controller_parameter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalWithDouble_params {

    @RequestMapping("/add")
    public double add(@RequestParam double a, @RequestParam double b){
        double result =a+b;
        return result;
    }

    @RequestMapping("/sub")
    public double sub(@RequestParam double a, @RequestParam double b){
        double result =a-b;
        return result;
    }

    @RequestMapping("/mul")
    public double mult(@RequestParam double a, @RequestParam double b){
        double result =a*b;
        return result;
    }

    @RequestMapping("/div")
    public double divi(@RequestParam double a, @RequestParam double b){
        double result =a/b;
        return result;
    }

}
