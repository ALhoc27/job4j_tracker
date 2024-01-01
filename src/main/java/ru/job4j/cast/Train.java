package ru.job4j.cast;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Ехать по железным путям");
    }

    @Override
    public void stop() {
        Vehicle.super.stop();
        System.out.println(" Train");
    }
}
