package com.example.bankspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

@RestController
public class BankSpringBootApplication {

    @GetMapping("/welcome")
    public String welcome(){
        return "welcome to bank compuse" ;
    }
    public static void main(String[] args) {
        SpringApplication.run(BankSpringBootApplication.class, args);
    }

}
