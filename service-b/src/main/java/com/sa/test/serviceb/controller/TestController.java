package com.sa.test.serviceb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    @Autowired
    private ServiceAFeignClient serviceAFeignClient;
    
    @RequestMapping("/call")
    public String call(){
        String res=serviceAFeignClient.hello();
        return "b调用a，结果："+res;
    }
    
    
}
