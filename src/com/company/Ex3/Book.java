package com.company.Ex3;

public class Book {
    private String Author;
    private String Title;
    private int Publication_year;
    public Book(String Author, String Title, int Publication_year) {
        this.Author = Author;
        this.Title = Title;
        this.Publication_year = Publication_year;
    }
    public void setAuthor(String Author){
        this.Author = Author;
    }
    public void setTitle(String Title){
        this.Title = Title;
    }
    public void setPublication_year(int Publication_year){
        this.Publication_year = Publication_year;
    }
    public String getTitle(){
        return Title;
    }
    public String getAuthor(){
        return Author;
    }
    public int getPublicationYear(){
        return Publication_year;
    }
    @Override
    public String toString() {
        return "Book{" +
                "Author='" + Author + '\'' +
                ", Title ='" + Title + '\'' +
                ", Publication_year=" + Publication_year +
                '}';
    }
}
