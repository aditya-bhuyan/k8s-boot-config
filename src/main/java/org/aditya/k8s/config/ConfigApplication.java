package org.aditya.k8s.config;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigApplication {
    public static void main(String []args){
        SpringApplication.run(ConfigApplication.class,args);
    }
    private String message = "Welcome to Config Controller";
    @GetMapping("/")
    public String index() {
        System.out.println(message);
        return message;
    }
}
