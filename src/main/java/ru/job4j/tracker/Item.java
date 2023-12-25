package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.util.Objects;

public class Item {
    private int id;
    private String name;
    private LocalDateTime created = LocalDateTime.now();

    public Item() { }

    public Item(String name) {
        this.name = name;
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public LocalDateTime getCreated() {
        return this.created;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", created=" + created + '}';
    }

    public static void main(String[] args) {
        int age = 12;
        String name = "Alex";
        System.out.println(String.format("Привет! Я %s, мой возраст: %s", name, age)); // Привет! Я Alex, мой возраст: 12
        System.out.printf("Строка c форматированием: %.2f%n", 1000.0 / 3.0); // Строка c форматированием: 333,33
    }

}