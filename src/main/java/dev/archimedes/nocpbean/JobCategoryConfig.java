package dev.archimedes.nocpbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "dev.archimedes.nocpbean")
@PropertySource("classpath:employee.properties")
public class JobCategoryConfig {

    @Value("#{new Double('${festiveBonus:0}')}")
    private double festiveBonus;

    @Value("#{new Double('${incentive:0}')}")
    private double incentive;

    @Value("#{new Double('${jobBonus:0}')}")
    private double jobBonus;

    @Autowired
    private JobCategory category;

    public void setBonus(){
        for(Employee employee: category.employees){
            employee.setBonus(festiveBonus + jobBonus + incentive);
        }
    }
}
