package com.sa.test.serviceb.service.hystrix;

import com.sa.test.serviceb.service.ServiceCFeignClient;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class ServiceCFeignClientHystrix implements FallbackFactory<ServiceCFeignClient> {
    @Override
    public ServiceCFeignClient create(Throwable throwable) {
        return new ServiceCFeignClient() {
            @Override
            public String hello() {
                return "hystrix-----factory----error："+throwable.getMessage();
            }
        };
    }
}
