package ru.job4j.format;

import java.util.Calendar;
import java.util.Formatter;

public class Format {
    public static void getGreeting(String name) {
        System.out.println(String.format("Привет! Я %s", name));
    }

    public static void main(String[] args) {
        getGreeting("Елена");
        getGreetingAndTime("Alex");
    }

    public static void getGreetingAndTime(String name) {
        Calendar instance = Calendar.getInstance();
        System.out.println(String.format("Текущая дата: %tF, Текущее время: %tT", instance, instance));

        String str = String.format("Расстояние от Киева до Одессы - %.2f.  ", 475.4d);
        System.out.println(str);
        System.out.println(String.format("%1$,+016.2f", 5000000.0000));
    }
}
