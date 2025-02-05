package com.itshaala;

import com.itshaala.config.SpringConfiguration;
import com.itshaala.model.Event;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext
                = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Event event = annotationConfigApplicationContext.getBean(Event.class);
        System.out.println(event);

    }
}
