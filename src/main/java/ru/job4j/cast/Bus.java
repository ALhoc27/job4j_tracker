package ru.job4j.cast;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Ехать по дороге");
    }

    @Override
    public void stop() {
        Vehicle.super.stop();
        System.out.println(" Bus");
    }
}