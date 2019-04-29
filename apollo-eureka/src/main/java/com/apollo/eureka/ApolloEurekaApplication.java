package com.apollo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务注册中心
 *
 * @author 73955
 */
@SpringBootApplication
@EnableEurekaServer
public class ApolloEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApolloEurekaApplication.class, args);
    }

}
