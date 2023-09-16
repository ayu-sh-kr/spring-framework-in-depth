package dev.archimedes.bean;

public class WelcomeBean {
    private String name;

    public WelcomeBean() {
    }

    public WelcomeBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String welcomeMessage(){
        return "Welcome " + name;
    }
    public void initializeBean() {
        System.out.println("Welcome Bean is initialized!!");
    }

    public void destroyBean() {
        System.out.println("Welcome Bean is destroyed!!");
    }
    @Override
    public String toString() {
        return "WelcomeBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
