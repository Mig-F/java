package com.company.Ex3;

    public class HumanTest {
        public static void main(String[] args) {
            Hand Hand = new Hand(34,4);
            Leg Leg = new Leg(55, 6);
            Head Head = new Head(30,"blue");
            Human Human = new Human(Head,Leg,Hand);
            System.out.println(Human);
        }
}
