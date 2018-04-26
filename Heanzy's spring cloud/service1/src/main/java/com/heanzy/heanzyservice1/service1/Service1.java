package com.heanzy.heanzyservice1.service1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Service1 {
    @Value("${server.port}")
    String port;

    @Value("${spring.application.name}")
    String name;

    public String Service(){

        return "hello,this service's name is"+name+",port is"+port;
    }
}
