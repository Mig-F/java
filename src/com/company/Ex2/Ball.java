package com.company.Ex2;

public class Ball {
     double cost;
     String material;
    public Ball( double cost, String material)
    {
        this.cost = cost;
        this.material = material;
    }
    public void setCost (double cost){
        this.cost = cost;
    }
    public double getCost()
    {
        return cost;
    }
    @Override
    public String toString()
    {
        return "Ball {" +
                "material='" + material + '\'' +
                '}';
    }
    void printBallInfo()
    {
        System.out.println(cost);
        System.out.println(material);
    }
}
