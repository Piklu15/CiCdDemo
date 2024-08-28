package com.bjitacademy.cicd.CicdDemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cicd/test")
public class TestController {
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String sayHi() {
        return "Welcome to the CI-CD world";
    }

    @GetMapping("ld")
    @ResponseStatus(HttpStatus.OK)
    public String sayLoud() {
        return "Say loudly";
    }
}
