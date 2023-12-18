package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book lake = new Book("lake", 12);
        Book woeFromWit = new Book("Woe from wit", 45);
        Book cleanCode = new Book("Clean code", 65);
        Book boston = new Book("Boston", 114);
        Book[] books = {lake, woeFromWit, cleanCode, boston};
        printBook(books);
        rearrangementOf2ElementsArrayBook(books, 0, 3);
        printBook(books);
        printBookWithFilter(books, "поиск 'Clean code'");
    }

    static public void printBookWithFilter(Book[] a, String nameFilterField) {
        System.out.println("Массив книг (c фильтром по " + nameFilterField + "): " + a);
        for (int i = 0; i < a.length; i++) {
            if (a[i].getBookTitle().equals("Clean code")) {
                System.out.println("№ " + i + " Книга: " + a[i].getBookTitle());
            }
        }
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

