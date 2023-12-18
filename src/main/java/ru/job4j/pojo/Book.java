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

    public void printBook(Book a) {
        System.out.println("Название книги: " + a.getBookTitle() + "\n" + "Кол-во страниц: " + a.getCount());
    }

    static public void printBook(Book[] a) {
        System.out.println("Массив книг: " + a);
        for (int i = 0; i < a.length; i++) {
            System.out.println("№ " + i + " Книга: " + a[i].getBookTitle());
        }
    }

    static public Book[] rearrangementOf2ElementsArrayBook(Book[] a, int x, int y) {
        Book bookTemp = a[x];
        a[x] = a[y];
        a[y] = bookTemp;
        return a;
    }

}
