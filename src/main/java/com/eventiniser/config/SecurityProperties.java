package com.eventiniser.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Getter
@Setter
@ConfigurationProperties("security")
public class SecurityProperties {

    private List<String> allowedOrigins = List.of("*");
}
