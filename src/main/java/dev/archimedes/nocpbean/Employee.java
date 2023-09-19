package dev.archimedes.nocpbean;

import java.util.UUID;

public class Employee {
    private String id;
    private String name;
    private String email;
    private String education;
    private double salary;
    private double bonus;

    public Employee(String name, String email, String education, double salary) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.email = email;
        this.education = education;
        this.salary = salary;
    }

    public Employee(){

    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", education='" + education + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                '}';
    }
}
