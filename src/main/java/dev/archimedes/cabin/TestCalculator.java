package dev.archimedes.cabin;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestCalculator implements InitializingBean {

    @Autowired
    private Calculator calculator;

    public TestCalculator(){

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(calculator.sum(10, 20));
    }

}
