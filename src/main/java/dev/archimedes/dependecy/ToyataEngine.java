package dev.archimedes.dependecy;

public class ToyataEngine implements IEngine{
    private String company;
    private double cost;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String importOrigin() {
        return null;
    }

    @Override
    public double cost() {
        return 0;
    }

    @Override
    public String toString() {
        return "ToyataEngine{" +
                "company='" + company + '\'' +
                ", cost=" + cost +
                '}';
    }

    public void initialization(){
        System.out.println("Initialized: " + company + " engine bean");
    }

    public void destroyed(){
        System.out.println("Destroyed: " + company + " engine bean");
    }
}
