package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            System.out.print("Выбрать: ");
            int select = Integer.parseInt(scanner.nextLine());
            if (select == 6) {
                System.out.println("Пользователь выбрал: " + select + " (Завершить программу)" + System.lineSeparator());
                break;
            } else if (select == 5) {
                System.out.println("Пользователь выбрал: " + select + " (Показать заявки по имени)" + System.lineSeparator());
            } else if (select == 4) {
                System.out.println("Пользователь выбрал: " + select + " (Показать заявку по id)" + System.lineSeparator());
            } else if (select == 3) {
                System.out.println("Пользователь выбрал: " + select + " (Удалить заявку)" + System.lineSeparator());
            } else if (select == 2) {
                System.out.println("Пользователь выбрал: " + select + " (Изменить заявку)" + System.lineSeparator());
            } else if (select == 1) {
                System.out.println("Пользователь выбрал: " + select + " (Показать все заявки)" + System.lineSeparator());
            } else if (select == 0) {
                System.out.print("Пользователь выбрал: " + select + " (Добавить новую заявку)" + System.lineSeparator());
                System.out.println("=== Создание новой заявки ===");
                System.out.println("Введите имя: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("Добавленная заявка: " + item + System.lineSeparator());
            } else {
                run = false;
            }
        }
    }

    private void showMenu() {
        String[] menu = {
                "Добавить новую заявку", "Показать все заявки", "Изменить заявку",
                "Удалить заявку", "Показать заявку по id", "Показать заявки по имени",
                "Завершить программу" };

        System.out.println("Меню:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
