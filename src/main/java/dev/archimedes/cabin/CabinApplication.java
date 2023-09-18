package dev.archimedes.cabin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CabinApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(TestCalculator.class);
        Calculator calculator = context.getBean(CalculatorImpl.class);
        System.out.println(calculator.sum(10, 20));
    }
}
