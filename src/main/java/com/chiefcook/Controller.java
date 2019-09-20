package com.chiefcook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RestController
public class Controller {

    @RequestMapping("/")
    public String index() {
        return "Hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(Controller.class, args);
    }
}
