package ru.job4j.oop;

public class Project {
    String houseColor; // цвет дома
    int numberOfRooms; // количество комнат
    static int[] houseDimensions = new int[3];  // массив с 'размерами дома'
    // мы еще это не затрагивали, но массив, начинается всегда с 0
    // new int[3] означает что в нем 3 элемента, их индексы: 0, 1, 2

    public int costCalculation(int x, int y, int z) { // при вызове метода, передаем аргументы x, y, z
        houseDimensions[0] = x; // инициализация 1-ого элемента в массиве
        houseDimensions[1] = y; // инициализация 2-ого элемента в массиве
        houseDimensions[2] = z; // инициализация 3-ого элемента в массиве
        for (int i: houseDimensions) {
            System.out.print(" " + i);
        }         // выводит на экран аргументы, что передали
        System.out.println("\n V = " + x * y * z); // выводит на экран перемноженное число
        return x * y * z; // возвращает перемноженное число
    }

    public static void main(String[] args) { // метод вхождения, через который запускаем программу
        Project home1 = new Project();       // создаем экземляр 'home1' класса Project
        home1.houseColor = "red"; // присваиваем полю houseColor в экземпляре класса 'home1' значение "red" (обычно используют get и set)
        home1.costCalculation(12, 2, 1); // вызоваем метод, экземпляра 'home1' класса Project с аргументами x, y, z

        Project home2 = new Project();       // создаем экземляр 'home2' класса Project
        home1.houseColor = "black"; // присваиваем полю houseColor в экземпляре класса 'home2' значение "black" (обычно используют get и set)
        home2.costCalculation(3, 3, 7); // вызоваем метод, экземпляра 'home2' класса Project с аргументами x, y, z

        // получается шаблон (класс) Project, имеет поля:
        /*
        String houseColor; // цвет дома
        int numberOfRooms; // количество комнат
        static int[] houseDimensions = new int[3]; // массив с 'размерами дома'
        */
        // и имеет метод класса costCalculation(инструкцию), который принимает 3 аргумента, перемножает их и возвращает результат

        // вызываем метод main где и инициализируем поля экземпляров класса вызываем у них методы


                // Создаем и запускаем два потока
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
