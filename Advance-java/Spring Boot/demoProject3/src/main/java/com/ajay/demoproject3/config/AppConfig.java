package com.ajay.demoproject3.config;


import com.ajay.demoproject3.beans.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public CommandLineRunner cmdLineRunner() {

        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {

                System.out.println("------------------");
                stdBean1().displayStdDetails();

                System.out.println("------------------");
                stdBean2().displayStdDetails();
            }
        };
    }

    @Bean
    public Student stdBean1(){
        return new Student( "Ajinkya" ,31,95.2f);
    }
    @Bean
    public Student stdBean2(){
        return new Student( "Ajay" ,32,98.2f);
    }

}
