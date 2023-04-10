package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.transform.OutputKeys;

@Controller
@RequestMapping("hello")
public class hello {

    @GetMapping("")
    public String hello(){
        System.out.println("你好");
        return "OK";
    }

}
