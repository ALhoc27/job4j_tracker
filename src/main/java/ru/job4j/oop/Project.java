package ru.job4j.oop;

public class Project {
    String houseColor;
    int numberOfRooms;
    static int[] houseDimensions = new int[3];

    public int costCalculation(int x, int y, int z) {
        houseDimensions[0] = x;
        houseDimensions[1] = y;
        houseDimensions[2] = z;
        for (int i: houseDimensions) {
            System.out.print(" " + i);
        }
        System.out.println("\n V = " + x * y * z);
        return x * y * z;
    }

    public static void main(String[] args) {
        Project home1 = new Project();
        home1.houseColor = "red";
        home1.costCalculation(12, 2, 1);

        Project home2 = new Project();
        home1.houseColor = "black";
        home2.costCalculation(3, 3, 7);

                Thread thread1 = new Thread(() -> {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Поток 1: " + i);
                    }
                });

                Thread thread2 = new Thread(() -> {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Поток 2: " + i);
                    }
                });

                thread1.start();
                thread2.start();
    }
}
