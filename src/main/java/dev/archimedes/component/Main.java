package dev.archimedes.component;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        AddressService addressService = context.getBean(AddressService.class);
        Address address = addressService.getAddress("401B", "Bhora Main Bazar", "Jaunpur", "UP", 221201);
        System.out.println(address);
    }
}
