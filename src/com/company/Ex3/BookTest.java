package com.company.Ex3;

public class BookTest {
    public static void main(String[] args){
        int Publication_year = Integer.parseInt(args[2]);
        Book book1 =new Book(args[0],args[1], Publication_year);
        System.out.println(book1.toString());
    }
}
