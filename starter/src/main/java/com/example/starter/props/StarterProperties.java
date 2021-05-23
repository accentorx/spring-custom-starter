package com.example.starter.props;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("example.starter")
public class StarterProperties {

    private String username = "Anon";


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
