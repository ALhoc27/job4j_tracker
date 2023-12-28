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
                System.out.println("Пользователь выбрал: " + select);
                break;
            } else if (select == 5) {
                System.out.println("Пользователь выбрал: " + select);
                System.out.print("Введите имя: ");
                String name = scanner.nextLine();
                Item[] items = tracker.findByName(name);
                if (items.length > 0) {
                    for (Item item : items) {
                        System.out.println(item);
                    }
                } else {
                    System.out.println("Заявки с именем: " + name + " не найдены.");
                }
            } else if (select == 4) {
                System.out.println("Пользователь выбрал: " + select);
                System.out.print("Введите id заявки (которую хотим получить): ");
                int id = Integer.parseInt(scanner.nextLine());
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item);
                } else {
                    System.out.println("Заявка с введенным id: " + id + " не найдена.");
                }
                System.out.println("");
            } else if (select == 3) {
                System.out.println("Пользователь выбрал: " + select);
                System.out.print("Введите id заявки (которую хотим удаляем): ");
                int id = Integer.parseInt(scanner.nextLine());
                Item item = tracker.findById(id);
                System.out.println(item);
                System.out.print("Вы удаляете данную заявку? (1/0): ");
                int del = -1;
                while (del != 0 && del != 1) {
                    del = Integer.parseInt(scanner.nextLine());
                    if (del == 1) {
                        tracker.delete(id);
                        System.out.println(item != null ? "Заявка удалена успешно." : "Ошибка удаления заявки.");
                    } else if (del == 0) {
                        continue;
                    } else {
                        System.out.println("Не вверный ввод!");
                        System.out.print("Вы удаляете данную заявку? (1/0): ");
                    }
                }
                System.out.println("");

            } else if (select == 2) {
                System.out.println("Пользователь выбрал: " + select);
                System.out.println(" (Изменить заявку)");
                System.out.print("Введите id заявки(которую меняем): ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.print("Введите имя новой заявки: ");
                String name = scanner.nextLine();
                boolean result = tracker.replace(id, new Item(name));
                if (result) {
                    System.out.println("Заявка изменена успешно.");
                } else {
                    System.out.println("Заявка не изменена");
                }
                System.out.println("");
            } else if (select == 1) {
                System.out.println("Пользователь выбрал: " + select);
                System.out.println(" (Показать все заявки)");
                for (Item item: tracker.findAll()) {
                    System.out.println(item);
                }
                System.out.println("");
            } else if (select == 0) {
                System.out.print("Пользователь выбрал: " + select);
                System.out.println(" (Создание новой заявки)");
                System.out.print("Введите имя: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("Добавленная заявка: " + item + System.lineSeparator());
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
