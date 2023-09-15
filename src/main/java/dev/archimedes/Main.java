package dev.archimedes;

import dev.archimedes.Entity.Student;
import dev.archimedes.config.ApplicationConfig;
import dev.archimedes.services.OutputService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception{

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        OutputService outputService = context.getBean(OutputService.class);

        BeanFactory factory  = new ClassPathXmlApplicationContext("bean-factory.xml");
        Student student = (Student) factory.getBean("student");
        System.out.println(student);
        for (int i = 0; i < 5; i++){
            outputService.generateOutput();
            Thread.sleep(5000);
        }
    }
}