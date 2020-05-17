package com.sa.test.serveradminue;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableAdminServer
@EnableEurekaClient
@EnableDiscoveryClient
public class ServerAdminUeApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(ServerAdminUeApplication.class, args);
    }
    
}
