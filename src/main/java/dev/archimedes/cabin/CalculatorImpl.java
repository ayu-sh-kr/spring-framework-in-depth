package dev.archimedes.cabin;

import org.springframework.stereotype.Component;

@Component
public class CalculatorImpl implements Calculator{

    public CalculatorImpl(){
        super();
        System.out.println("Calculator created...");
    }
    @Override
    public double sum(double a, double b) {
        return a + b;
    }
}
