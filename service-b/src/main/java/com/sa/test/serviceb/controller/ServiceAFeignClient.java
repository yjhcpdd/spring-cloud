package com.sa.test.serviceb.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "SERVER-OBJECT-A")
public interface ServiceAFeignClient {
    
    @RequestMapping("/hello")
    public String hello();
    
}
