package ru.job4j.polymorphism;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("едет");
    }

    @Override
    public void passengers(int numberOfPassengers) {
        System.out.println("Кол-во пассажиров: " + numberOfPassengers);
    }

    @Override
    public double refuel(int quantitOfFuel) {
        return quantitOfFuel * Vehicle.COURSELIBRUB;
    }
}
