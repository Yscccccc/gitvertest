package com.ysc.gitvertest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello2Controller {

    @RequestMapping("/he")
    public String he() {
        return "lala";
    }
}
