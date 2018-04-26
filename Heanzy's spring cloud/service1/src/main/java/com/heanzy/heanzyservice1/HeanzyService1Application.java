package com.heanzy.heanzyservice1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableEurekaClient
@SpringBootApplication
public class HeanzyService1Application {

    public static void main(String[] args) { SpringApplication.run(HeanzyService1Application.class, args);}

//    @Autowired
//    Service1 service1;
//
//    @RequestMapping("/Myname")
//    public String Myname(){
//        return service1.Service();
//    }
}
