package org.aditya.k8s.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController {

    @Value("${ASIA:NOT SET}")
    private String ASIA;

    @Value("${SOUTH_AMERICA:NOT SET}")
    private String SOUTH_AMERICA;

    @Value("${DB_PASSWORD:NOT SET}")
    private String DB_PASSWORD;


    @GetMapping
    public String getConfig(){
        StringBuilder env = new StringBuilder();
        env.append("ASIA :"+ASIA+"\n");
        env.append("DB_PASSWORD : "+DB_PASSWORD+"\n");
        env.append("SOUTH_AMERICA : "+SOUTH_AMERICA);
        System.out.println(" ENV are "+env.toString());
        return env.toString();
    }
}
