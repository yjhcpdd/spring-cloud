package com.sa.test.serviceb.service.hystrix;

import com.sa.test.serviceb.service.ServiceAFeignClient;
import org.springframework.stereotype.Component;

@Component
public class ServiceAFeignClientHystrix implements ServiceAFeignClient {
    
    @Override
    public String hello() {
        return "hystrix error";
    }
}
