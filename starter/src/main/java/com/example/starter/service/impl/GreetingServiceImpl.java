package com.example.starter.service.impl;

import com.example.starter.props.StarterProperties;
import com.example.starter.service.GreetingService;

public class GreetingServiceImpl implements GreetingService {

    private final StarterProperties starterProperties;

    public GreetingServiceImpl(StarterProperties starterProperties) {
        this.starterProperties = starterProperties;
    }

    @Override
    public String greet() {
        return "Hello " + starterProperties.getUsername();
    }
}
