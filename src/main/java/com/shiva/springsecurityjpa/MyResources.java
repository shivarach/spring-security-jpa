package com.shiva.springsecurityjpa;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyResources {

    @RequestMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    @RequestMapping("/user")
    public String user() {
        return "Welcome User!";
    }

    @RequestMapping("/admin")
    public String admin() {
        return "Welcome Admin!";
    }
}
