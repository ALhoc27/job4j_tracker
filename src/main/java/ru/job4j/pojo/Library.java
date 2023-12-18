package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book lake = new Book("lake", 12);
        Book woeFromWit = new Book("Woe from wit", 45);
        Book cleanCode = new Book("Clean code", 65);
        Book boston = new Book("Boston", 114);
        Book[] books = {lake, woeFromWit, cleanCode, boston};

    }

    public void printBook(Book[] a) {
        for (int i = 0; i <= a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

