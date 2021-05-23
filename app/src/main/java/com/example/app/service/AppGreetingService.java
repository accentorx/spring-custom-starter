package com.example.app.service;

import com.example.starter.service.GreetingService;
import org.springframework.stereotype.Service;

//@Service
public class AppGreetingService implements GreetingService {
    @Override
    public String greet() {
        return "Hello from AppGreetingService";
    }
}
