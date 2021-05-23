package com.example.starter.autoconfigure;

import com.example.starter.props.StarterProperties;
import com.example.starter.service.GreetingService;
import com.example.starter.service.impl.GreetingServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ConditionalOnProperty(value = "example.starter", havingValue = "true", matchIfMissing = true)
@ComponentScan("com.example.starter")
@EnableConfigurationProperties(StarterProperties.class)
public class GreetingAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(GreetingService.class)
    @ConditionalOnClass(name = {
            "com.example.starter.controller.GreetingController",
            "com.example.starter.service.GreetingService",
    })
    public GreetingService getGreetingService(StarterProperties starterProperties) {
        return new GreetingServiceImpl(starterProperties);
    }

}
