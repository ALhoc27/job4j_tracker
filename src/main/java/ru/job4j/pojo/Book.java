package ru.job4j.pojo;

import java.util.Objects;

public class Book {
    private String bookTitle;
    private int count;

    public Book(String bookTitle, int count) {
        this.bookTitle = bookTitle;
        this.count = count;
    }

    public Book() {
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
