package com.project.fitness.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI fitTrackOpenAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("FitTrack API")
                        .version("1.0")
                        .description("Fitness Tracking and Recommendation Backend API"));
    }
}