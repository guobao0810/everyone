package com.babycare.eurekaserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class TestController {

    @RequestMapping("/init")
    public String init(){
        System.out.print("yes");
        return "成功";
    }
}
