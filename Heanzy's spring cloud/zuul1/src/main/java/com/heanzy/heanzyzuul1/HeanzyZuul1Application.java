package com.heanzy.heanzyzuul1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class HeanzyZuul1Application {

    public static void main(String[] args) {
        SpringApplication.run(HeanzyZuul1Application.class, args);
    }
}
