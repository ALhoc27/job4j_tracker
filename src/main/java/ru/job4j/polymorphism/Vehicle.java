package ru.job4j.polymorphism;

public interface Vehicle extends Fuel {
    public static final int COURSELIBRUB = 40;

    void accelerate();

    void brake();

    void steer();

    void changeGear();
}
