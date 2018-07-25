package com.ysc.gitvertest.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello git!HEY";
    }

    @RequestMapping("/hello2")
    public String hello2() {
        return "hello2";
    }
}
