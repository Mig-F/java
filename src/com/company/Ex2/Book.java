package com.company.Ex2;

public class Book {
    private String title;
    private int pages;
    public Book ( String title, int page)
    {
        this.title = title;
        this.pages = page;
    }

    public int getPage() {
        return pages;
    }
    public void setPage(int pages)
    {
        this.pages = pages;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    @Override
    public String toString() {
        return "Book{" +
                "pages=" + pages +
                ", title='" + title + '\'' +
                '}';
    }
}
