package ru.job4j.cast;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Train train = new Train();
        Plane plane = new Plane();

        Vehicle[] vehicle = new Vehicle[]{bus, train, plane};
        for (Vehicle vehicleItem : vehicle) {
            vehicleItem.move();
            vehicleItem.stop();
        }
    }
}
