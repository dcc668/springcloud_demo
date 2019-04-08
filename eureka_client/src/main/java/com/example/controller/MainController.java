package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
    @RequestMapping("/doSome")
    public String doSome(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "doSome " + name + " ,i am from port:" + port;
    }
    @RequestMapping("/test")
    public String test() {
        return "Success!!";
    }
}
