package com.FeastFleet.FeastFleet.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;
import java.util.List;

@Configuration
public class CorsConfig {

    @Bean
    CorsConfigurationSource corsConfigurationSource(){
         CorsConfiguration corsConfiguration = new CorsConfiguration();

        corsConfiguration.setAllowedOrigins(List.of("http://localhost:4200")); //Orígenees que pueden consumir esta API
        corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE")); //Métodos permitidos para usar desde el cliente
        corsConfiguration.setAllowedHeaders(List.of("*")); // headers permitidos TODOS
        corsConfiguration.setExposedHeaders(List.of("Authorization"));
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", corsConfiguration);

     return source;
    }

}
