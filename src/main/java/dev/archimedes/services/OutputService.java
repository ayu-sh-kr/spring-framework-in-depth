package dev.archimedes.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;

@Service
public class OutputService {

    @Value("${app.name}")
    private String name;
    private GreetingService greetingService;
    private TimeService timeService;


    public OutputService(GreetingService greetingService, TimeService timeService) {
        this.greetingService = greetingService;
        this.timeService = timeService;
    }


    public void generateOutput() {
        System.out.println(MessageFormat.format("{0} {1} {2}", timeService.getCurrentTime(), greetingService.getMessage(), name));
    }
}
