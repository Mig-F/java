package com.company.Ex3;

public class Hand {
    private int Hand_length;
    private int Hand_weight;
    public Hand(int Hand_length,int Hand_weight)
    {
        this.Hand_length = Hand_length;
        this.Hand_weight = Hand_weight;
    }
    public void setHand_Weight(int Hand_weight){
        this.Hand_weight = Hand_weight;
    }
    public int getHand_Weight(){
        return Hand_weight;
    }
    public void setLegHand_length(int Hand_length){
        this.Hand_length = Hand_length;
    }
    public int getHand_length(){
        return Hand_length;
    }
    @Override
    public String toString() {
        return "Hand{" +
                " Hand_length=" +  Hand_length +
                ", Hand_weight=" + Hand_weight +
                '}';
    }
}
