package com.bezkoder.springjwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.web.config.PageableHandlerMethodArgumentResolverCustomizer;

@SpringBootApplication
public class SpringBootSecurityJwtApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSecurityJwtApplication.class, args);
    }

    @Bean
    public PageableHandlerMethodArgumentResolverCustomizer paginationCustomizer() {
        return pageableResolver -> {
            pageableResolver.setOneIndexedParameters(true); //default is false, starts with 0
        };
    }
}
