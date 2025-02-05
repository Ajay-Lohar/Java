package com.itshaala;

import com.itshaala.config.BeanConfigurationAnnotation;
import com.itshaala.model.Event;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class AnnotationWayApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BeanConfigurationAnnotation.class);
        Event event = context.getBean("event", Event.class);
        System.out.println(event);
    }
}
