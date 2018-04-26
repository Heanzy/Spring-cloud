package com.heanzy.heanzyservice2.service2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Service2 {
    @Value("${server.port}")
    String port;

    @Value("${spring.application.name}")
    String name;

    public String Service(){

        return "hello,this service's name is "+name+",port is "+port;
    }
}
