package ru.job4j.io;

import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11 спичек");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.print(player + " введите число от 1 до 3: ");
            int matches = Integer.parseInt(input.nextLine());
            if (matches <= Math.min(3, count) && matches > 0) {
                System.out.println("Осталось " + (count - matches) + " спичек");
                turn = !turn;
                count -= matches;
            } else {
                System.out.println("Ошибка ввода, введите число повторно... ");
            }

        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }

}
