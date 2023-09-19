package dev.archimedes.nocpbean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Employee.class);
        Employee employee = context.getBean(Employee.class);
        employee.setId(UUID.randomUUID().toString());
        employee.setName("Ayush Jaiswal");
        employee.setEmail("akjaiswal2003@gmail.com");
        System.out.println(employee);
        context.close();

        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(JobCategoryConfig.class);
        JobCategoryConfig jobCategoryConfig = context1.getBean(JobCategoryConfig.class);
        jobCategoryConfig.setBonus();
        context1.getBean(JobCategory.class).getEmployees().stream().forEach(System.out::println);
    }
}
