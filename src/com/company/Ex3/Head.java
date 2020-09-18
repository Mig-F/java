package com.company.Ex3;

public class Head {
    private int weight;
    private String Color_eyes;
    public Head(int weight,String Color_eyes ){
        this.Color_eyes = Color_eyes;
        this.weight =weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public int getWeight(){
        return weight;
    }
    public void setColor_eyes(String Color_eyes){
        this.Color_eyes = Color_eyes;
    }
    public String  getColor_eyes(){
        return Color_eyes;
    }
    @Override
    public String toString() {
        return "Head{" +
                "weight=" + weight +
                ",Color eyes =" + Color_eyes +
                '}';
    }
}
