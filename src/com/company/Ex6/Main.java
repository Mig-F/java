package com.company.Ex6;

public class Main {
    public static void main(String[] args) {
        Movable p = new MovableCircle(45, "black", 5, 8);
        System.out.println(p);
        p.move(3, -7);
        System.out.println(p);
    }
}