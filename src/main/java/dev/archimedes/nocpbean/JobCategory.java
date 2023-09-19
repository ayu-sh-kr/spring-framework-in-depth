package dev.archimedes.nocpbean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope()
public class JobCategory {
    List<Employee> employees = new ArrayList<>();


    public JobCategory(){
        employees.addAll(List.of(
                new Employee("Amit Kumar", "amitkumar2001", "BTech IT", 75000),
                new Employee("Anurag Shukla", "shukla.anurag2001", "BTech IT", 84000)
        ));
    }
    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public List<Employee> getEmployees(){
        return employees;
    }
}
