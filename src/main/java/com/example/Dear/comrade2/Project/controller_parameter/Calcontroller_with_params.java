package com.example.Dear.comrade2.Project.controller_parameter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calcontroller_with_params {

    @RequestMapping("/addit")
    public int add(@RequestParam int a,@RequestParam int b){
        int result = a+b;
        return result;
    }

    @RequestMapping("/subs")
    public int sub(@RequestParam int a,@RequestParam int b){
        int result = a-b;
        return result;
    }

    @RequestMapping("/multiple")
    public int mult(@RequestParam int a, @RequestParam int b){
        int result = a*b;
        return result;
    }

    @RequestMapping("/divisible")
    public int div(@RequestParam int a, @RequestParam int b){
        int result = a/b;
        return result;
    }

}
