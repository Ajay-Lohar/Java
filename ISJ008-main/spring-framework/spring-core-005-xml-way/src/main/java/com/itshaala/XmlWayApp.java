package com.itshaala;

import com.itshaala.model.Event;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class XmlWayApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-bean-cfg.xml");
        Event event = context.getBean("event", Event.class);
        System.out.println(event);
    }
}
