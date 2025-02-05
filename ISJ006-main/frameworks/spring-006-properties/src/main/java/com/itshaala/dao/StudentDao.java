package com.itshaala.dao;

import com.itshaala.model.Student;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;

@Repository
@PropertySource(value = "classpath:application.properties")
//@AllArgsConstructor
public class StudentDao {


    @Autowired
    Environment environment;

    @Value("this is value given")
    public String value;

    @SneakyThrows
    public void addStudent(Student student) {
        System.out.println("student added");
        //read properties
     /*   Properties properties = new Properties();
        properties.load(new FileInputStream("C:\\Work\\ISJ006\\frameworks\\spring-006-properties\\src\\main\\resources\\application.properties"));
        System.out.println(properties.get("mysql.username"));
        System.out.println(properties.get("mysql.password"));
        System.out.println(properties.get("mysql.url"));*/

        //using environment
        System.out.println(environment.getProperty("mysql.username"));
        System.out.println(environment.getProperty("mysql.password"));
        System.out.println(environment.getProperty("mysql.url"));

    }
}
