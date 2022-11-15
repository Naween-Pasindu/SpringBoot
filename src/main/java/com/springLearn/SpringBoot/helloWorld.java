package com.springLearn.SpringBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorld {
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}
