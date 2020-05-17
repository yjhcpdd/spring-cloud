package com.sa.test.serviceb.service;

import com.sa.test.serviceb.service.hystrix.ServiceAFeignClientHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "SERVER-OBJECT-A",fallback = ServiceAFeignClientHystrix.class)
public interface ServiceAFeignClient {
    
    @RequestMapping("/hello")
    public String hello();

}
