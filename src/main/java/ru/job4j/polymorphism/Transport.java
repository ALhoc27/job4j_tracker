package ru.job4j.polymorphism;

public interface Transport {

    void drive();

    void passengers(int numberOfPassengers);

    double refuel(int quantitOfFuel);
}
