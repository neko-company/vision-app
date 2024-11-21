package com.nekocompany.visionapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins(
                        "http://localhost:3000", // For development
                        "https://visionapp-442323.web.app" // Deployed React app
                )
                .allowedMethods("*")
                .allowedHeaders("*")
                .allowCredentials(true); // Allows cookies if needed
    }
}
