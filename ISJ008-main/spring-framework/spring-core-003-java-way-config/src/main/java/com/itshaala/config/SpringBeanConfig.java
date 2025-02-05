package com.itshaala.config;

import com.itshaala.model.Course;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = {"com.itshaala"})
public class SpringBeanConfig {

    @Bean(name = "courseBean")
    @Scope("prototype")
    public Course getCourse() {
        return new Course(103, "Full Stack development", "offline", 199);
    }


}
