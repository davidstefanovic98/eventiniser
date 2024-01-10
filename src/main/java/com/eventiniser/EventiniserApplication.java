package com.eventiniser;

import com.eventiniser.config.JwtProperties;
import com.eventiniser.config.SecurityProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({JwtProperties.class, SecurityProperties.class})
public class EventiniserApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventiniserApplication.class, args);
    }

}
