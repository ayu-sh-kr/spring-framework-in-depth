package dev.archimedes.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("bean-factory.xml");
        System.out.println("Before getBean() method");
        WelcomeBean welcomeBean = (WelcomeBean) factory.getBean("welcomeBean");
        System.out.println(welcomeBean.welcomeMessage());
        factory.close();
    }
}
