package ru.job4j.tracker;

public class StartUI {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            int select = input.askInt("Выбрать: ");
            if (select == 6) {
                System.out.println("Пользователь выбрал: " + select);
                run = false;
            } else if (select == 5) {
                findItemByName(input, tracker);
            } else if (select == 4) {
                findItemById(input, tracker);
            } else if (select == 3) {
                deleteItem(input, tracker);
            } else if (select == 2) {
                replaceItem(input, tracker);
            } else if (select == 1) {
                findAllItems(tracker);
            } else if (select == 0) {
                createItem(input, tracker);
            }
        }
    }

    public static void findItemByName(Input input, Tracker tracker) {
        String name =  input.askStr("Введите имя: ");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Заявки с именем: " + name + " не найдены.");
        }
    }

    public static void findItemById(Input input, Tracker tracker) {
        int id = input.askInt("Введите id заявки (которую хотим получить): ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Заявка с введенным id: " + id + " не найдена.");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Удаление заявки ===");
        int id = input.askInt("Введите id: ");
        Item item = tracker.findById(id);
        tracker.delete(id);
        System.out.println(item != null ? "Заявка удалена успешно." : "Ошибка удаления заявки.");
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println(" (Изменить заявку)");
        int id = input.askInt("Введите id заявки(которую меняем): ");
        String name = input.askStr("Введите имя новой заявки: ");
        boolean result = tracker.replace(id, new Item(name));
        if (result) {
            System.out.println("Заявка изменена успешно.");
        } else {
            System.out.println("Заявка не изменена");
        }
    }

    public static void findAllItems(Tracker tracker) {
        Item[] items = tracker.findAll();
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Хранилище еще не содержит заявок");
        }
    }

    public static void createItem(Input input, Tracker tracker) {
        System.out.println(" (Создание новой заявки)");
        String name = input.askStr("Введите имя: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Добавленная заявка: " + item + System.lineSeparator());
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
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
