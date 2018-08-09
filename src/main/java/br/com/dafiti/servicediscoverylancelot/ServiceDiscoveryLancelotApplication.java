package br.com.dafiti.servicediscoverylancelot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscoveryLancelotApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDiscoveryLancelotApplication.class, args);
    }
}
