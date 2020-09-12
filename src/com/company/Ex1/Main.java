package com.company.Ex1;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            System.out.println(sum);
        }
        System.out.println(sum);
        sum = 0;
        int i = 0;
        while (i < array.length) {
            sum = sum + array[i];
            i++;
        }
        System.out.println(sum);
        sum = 0;
        i = 0;
        do {
            sum = sum + array[i];
            i++;
        } while (i < array.length);
        System.out.println(sum);

        for (int j = 1; j < 11; j++ )
        {
            System.out.println(1 + "/" + j);
        }
    }
}
