package dev.archimedes.cabin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CabinApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(TestCalculator.class);
        Calculator calculator = context.getBean(CalculatorImpl.class);
        System.out.println(calculator.sum(10, 20));

        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext();
        context1.scan("dev.archimedes.cabin");
        context1.refresh();
        Calculator calculator1 = context1.getBean(CalculatorImpl.class);
        System.out.println(calculator1.sum(10, 20));
        context1.close();
    }
}
