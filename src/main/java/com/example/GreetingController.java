package com.example;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class GreetingController {
    @GetMapping("/greet")
    public String greet(@RequestParam(defaultValue="World") String name){
   return "Hello, "+name+"!";
    }
}
