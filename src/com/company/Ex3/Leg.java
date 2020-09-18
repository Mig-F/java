package com.company.Ex3;

public class Leg {
    private int Leg_length;
    private int Leg_weight;
    public Leg(int Leg_length,int Leg_weight)
    {
        this.Leg_length = Leg_length;
        this.Leg_weight = Leg_weight;
    }
    public void setLeg_Weight(int Leg_weight){
        this.Leg_weight = Leg_weight;
    }
    public int getLeg_Weight(){
        return Leg_weight;
    }
    public void setLegLeg_length(int Leg_length){
        this.Leg_length = Leg_length;
    }
    public int getLeg_length(){
        return Leg_length;
    }
    @Override
    public String toString() {
        return "Leg{" +
                " Leg_length=" +  Leg_length +
                ", Leg_weight=" + Leg_weight +
                '}';
    }
}
