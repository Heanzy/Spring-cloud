package com.heanzy.heanzyservice2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.heanzy.heanzyservice2.service2.Service2;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class HeanzyService2Application {
//    @Autowired
//    Service2 service2;

    public static void main(String[] args) {
        SpringApplication.run(HeanzyService2Application.class, args);

        }


//    @RequestMapping("/Myname")
//    public String Myname(){
//        return service2.Service();
//    }
}
