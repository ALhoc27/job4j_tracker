package ru.job4j.cast;

public interface Vehicle {
    void move();

    default void stop() {
        System.out.print("Stop");
    }
}
