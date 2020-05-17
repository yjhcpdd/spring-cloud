package com.sa.test.serviceb.controller;

import com.sa.test.serviceb.service.ServiceCFeignClient;
import com.sa.test.serviceb.service.ServiceAFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    @Autowired
    private ServiceAFeignClient serviceAFeignClient;
    
    @Autowired
    private ServiceCFeignClient serviceCFeignClient;
    
    @RequestMapping("/callA")
    public String callA(){
        String res=serviceAFeignClient.hello();
        return "b调用a，结果："+res;
    }

    @RequestMapping("/callC")
    public String callC(){
        String res=serviceCFeignClient.hello();
        return "call2：b调用a，结果："+res;
    }
    
}
