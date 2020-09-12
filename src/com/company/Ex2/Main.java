package com.company.Ex2;

import com.company.Ex2.Ball;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Ball Ball = new Ball(12, "plastic");
        double cst = Ball.getCost();
        System.out.println(cst);
        Ball.setCost(13);
        System.out.println(Ball.getCost());
        System.out.println(Ball);
        Nursery(args);


    }
    public static void Nursery(String[] args) {
        Nursery dogs = new Nursery();
        Dog dog =new Dog ("Mukhtar", 2);
                dogs.addDog(dog);
        System.out.println(Arrays.toString(dogs.list()));
    }
}