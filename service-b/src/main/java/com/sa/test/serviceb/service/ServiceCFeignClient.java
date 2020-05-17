package com.sa.test.serviceb.service;

import com.sa.test.serviceb.service.hystrix.ServiceCFeignClientHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "SERVER-OBJECT-C",fallbackFactory = ServiceCFeignClientHystrix.class)
public interface ServiceCFeignClient {
    
    @RequestMapping("/hello")
    public String hello();
    
}
