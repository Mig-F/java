package com.company.Ex2;

import com.company.Ex2.Dog;

public class Nursery {
    int i = 0;
Dog[] dogs = new Dog[6];
    public void addDog(Dog dog) {
        dogs[i] = dog;
        i++;
    }
    public Dog[] list()
    {
        return dogs;
    }
}
