package com.sa.test.servicea.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("call-------------------hello");
        
        
        return "hello...8091-----------";
    }
    
}
