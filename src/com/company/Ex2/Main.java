package com.company.Ex2;

import com.company.Ex2.Ball;

public class Main {

    public static void main(String[] args) {
        Ball Ball = new Ball(12, "plastic");
        double cst = Ball.getCost();
        System.out.println(cst);
        Ball.setCost(13);
        System.out.println(Ball.getCost());
        System.out.println(Ball);
    }
}
