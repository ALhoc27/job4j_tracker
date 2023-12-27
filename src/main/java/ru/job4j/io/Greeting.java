package ru.job4j.io;

import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println(name);

        System.out.println(new Scanner(System.in).nextLine());

        /*System.out.println(name + ", рад Вас видеть!");
        System.out.println(new Scanner(System.in).nextLine());*/
    }
}