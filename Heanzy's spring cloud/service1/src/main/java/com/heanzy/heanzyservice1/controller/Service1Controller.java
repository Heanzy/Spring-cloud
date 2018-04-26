package com.heanzy.heanzyservice1.controller;


import com.heanzy.heanzyservice1.service1.Service1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class Service1Controller {

    @Autowired
    Service1 service1;

    @RequestMapping("Myname")
    public String Myname(){
        return service1.Service();
    }

}
