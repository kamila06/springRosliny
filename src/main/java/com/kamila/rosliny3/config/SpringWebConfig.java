package com.kamila.rosliny3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc //<mvc:annotation-driven />
@Configuration
@ComponentScan({ "com.kamila.rosliny3.controller" })
public class SpringWebConfig extends WebMvcConfigurerAdapter  {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(
                "/images/**",
                "/css/**")
                .addResourceLocations(
                        "classpath:/static/images/",
                        "classpath:/static/css/");
    }

}