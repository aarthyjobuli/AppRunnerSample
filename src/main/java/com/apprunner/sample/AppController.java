package com.apprunner.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    
    @GetMapping("/welcome")
    public String sample() {
        return "Welcome BasicAuth Sample Test App";
    }
}
