package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int random = new Random().nextInt(3);
        System.out.println("Я великий Оракул. Что ты хочешь узнать? ");
        System.out.print("Задайте оракулу вопрос, на который можно ответить да/нет: ");
        System.out.print(scanner.nextLine() + " - ");
        int i = 0;
        if (random == 0) {
            System.out.println("Да");
        } else if (random == 1) {
            System.out.println("Нет");
        } else {
            System.out.println("Может быть");
        }
    }
}

