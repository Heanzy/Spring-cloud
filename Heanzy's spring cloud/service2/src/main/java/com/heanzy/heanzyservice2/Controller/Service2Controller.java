package com.heanzy.heanzyservice2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import com.heanzy.heanzyservice2.service2.Service2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class Service2Controller {
    @Autowired
    Service2 service2;

    @RequestMapping("/Myname")
    public String Myname(){
        return service2.Service();
    }

}
