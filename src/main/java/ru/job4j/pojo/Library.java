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

    static public void printBookWithFilter(Book[] book, String nameFilterField) {
        System.out.println("Массив книг (c фильтром по " + nameFilterField + "): " + book);
        for (int i = 0; i < book.length; i++) {
            if ("Clean code".equals(book[i].getBookTitle())) {
                System.out.println("№ " + i + " Книга: " + book[i].getBookTitle());
            }
        }
    }

    public void printBook(Book book) {
        System.out.println("Название книги: " + book.getBookTitle() + System.lineSeparator() + "Кол-во страниц: " + book.getCount());
    }

    static public void printBook(Book[] book) {
        System.out.println("Массив книг: " + book);
        for (int i = 0; i < book.length; i++) {
            System.out.println("№ " + i + " Книга: " + book[i].getBookTitle());
        }
    }

    static public Book[] rearrangementOf2ElementsArrayBook(Book[] book, int x, int y) {
        Book bookTemp = book[x];
        book[x] = book[y];
        book[y] = bookTemp;
        return book;
    }

}

