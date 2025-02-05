package com.itshaala.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@PropertySource("classpath*:application.properties")
public class Event {
    @Value("${event-id}")
    private int id;

    @Value("${event-name}")
    private String name;

    @Value("${event-desc}")
    private String description;

    @Value("${service-now-url}")
    private String servicenowUrl;

    @Value("${aws-endpoint}")
    private String awsUrl;
}
