package dev.archimedes.dependecy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Vehicle {
    private IEngine engine;
    private Tyres tyre;

    public Vehicle(IEngine engine, Tyres tyre) {
        this.engine = engine;
        this.tyre = tyre;
    }

    public Vehicle() {
    }

    public IEngine getEngine() {
        return engine;
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    public Tyres getTyre() {
        return tyre;
    }

    public void setTyre(Tyres tyre) {
        this.tyre = tyre;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "engine=" + engine +
                ", tyre=" + tyre +
                '}';
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dependency-bean.xml");

        Vehicle vehicle1 = (Vehicle) context.getBean("injectedWithSetter");
        Vehicle vehicle2 = (Vehicle) context.getBean("injectedWithConstructor");

        System.out.println(vehicle1);
        System.out.println(vehicle2);
        System.out.println(vehicle1 == vehicle2);

        context.close();
    }
}
