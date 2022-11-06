package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
    
 // Besprechen : @Controller
 // annotation für Dependency Injection
    @GetMapping("/helloWorld")     // Die URL
    public String getHelloWorld() {
        return "helloWorld"; // Name des Templates
    }
}
