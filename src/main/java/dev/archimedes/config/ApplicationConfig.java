package dev.archimedes.config;

import dev.archimedes.Entity.Student;
import dev.archimedes.services.GreetingService;
import dev.archimedes.services.OutputService;
import dev.archimedes.services.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = "dev.archimedes.services")
public class ApplicationConfig {

//    @Value("${app.greeting}")
//    private String greeting;
//
//    @Value("${app.name}")
//    private String name;
//
//    @Value("#{new Boolean(environment['spring.profiles.active']!='dev')}")
//    private boolean is24;

    @Autowired
    private GreetingService greetingService;

    @Autowired
    private TimeService timeService;

    @Bean
//    @Profile("!dev")
    public TimeService timeService(){
        return new TimeService();
    }

//    @Bean
//    @Profile("dev")
//    public TimeService timeService12(){
//        return new TimeService(is24);
//    }

    @Bean
    public GreetingService greetingService(){
        return new GreetingService();
    }

    @Bean
    public OutputService outputService(){
        return new OutputService(greetingService, timeService);
    }

    @Bean
    public Student student(){
        return new Student("Aastha", 21);
    }
}
