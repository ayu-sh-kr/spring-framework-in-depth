package dev.archimedes.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DetailsBeanTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("dependency-bean.xml");
        Details detailsBean = (Details) context.getBean("info");
        System.out.println(detailsBean);
    }
}
