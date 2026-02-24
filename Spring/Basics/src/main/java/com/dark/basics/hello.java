package com.dark.basics;

import org.springframework.web.bind.annotation.*;

@RestController
public class hello {

    @GetMapping("/hello")
    public String helo(){
        return "hello";
    }

    @PostMapping("/hello")
    public String helloPost(@RequestBody String name){
        return "hello " + name + "..!";
    }
}

