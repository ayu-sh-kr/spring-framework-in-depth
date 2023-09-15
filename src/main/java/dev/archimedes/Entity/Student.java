package dev.archimedes.Entity;

import java.util.UUID;

public class Student {
    private String uuid;
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.uuid = UUID.randomUUID().toString();
        this.name = name;
        this.age = age;
    }

    public String getUuid() {
        return uuid;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
