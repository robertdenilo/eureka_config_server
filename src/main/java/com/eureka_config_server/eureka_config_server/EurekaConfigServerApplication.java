package com.eureka_config_server.eureka_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class EurekaConfigServerApplication {
    //http://localhost:8080/order-a.yml            a is profile, should be prod/dev
    //http://localhost:8080/release/order-a.yml    release is git branch
    public static void main(String[] args) {
        SpringApplication.run(EurekaConfigServerApplication.class, args);
    }
}
