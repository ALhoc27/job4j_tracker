package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.action.*;
import ru.job4j.tracker.action.UserAction;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class StartUITest {

    @Test
    void whenCreateItem() {
        Output output = new StubOutput();

        Input input = new MockInput(
                new String[] {"0", "Item name", "0", "sasa", "1", "2"}
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new Create(output));
        actions.add(new FindAll(output));
        actions.add(new Exit(output));

        new StartUI(output).init(input, tracker, actions);
        assertThat(tracker.findAll().get(0).getName()).isEqualTo("Item name");
    }

    @Test
    void whenReplaceItem() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item")); /* Добавляется в tracker новая заявка */
        String replacedName = "New item name";
        Input input = new MockInput(
                new String[] {"0", String.valueOf(item.getId()), replacedName, "1"}
        );

        List<UserAction> actions = new ArrayList<>();
        actions.add(new Replace(output));
        actions.add(new Exit(output));

        new StartUI(output).init(input, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName()).isEqualTo(replacedName);

    }

    @Test
    void whenDeleteItem() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item")); /* Добавляется в tracker новая заявка */
        Input input = new MockInput(
                new String[] {"0", String.valueOf(item.getId()), "1"}
        );

        List<UserAction> actions = new ArrayList<>();
        actions.add(new Delete(output));
        actions.add(new Exit(output));

        new StartUI(output).init(input, tracker, actions);
        assertThat(tracker.findById(item.getId())).isNull();
    }

    @Test
    void whenReplaceItemTestOutputIsSuccessfully() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        String replaceName = "New Test Name";
        Input input = new MockInput(
                new String[] {"0", String.valueOf(one.getId()), replaceName, "1"}
        );

        List<UserAction> actions = new ArrayList<>();
        actions.add(new Replace(output));
        actions.add(new Exit(output));

        new StartUI(output).init(input, tracker, actions);
        String ln = System.lineSeparator();
        output.toString();
        assertThat(output.toString()).isEqualTo(
                "Меню:" + ln
                        + "0. Изменить заявку" + ln
                        + "1. Завершить программу" + ln
                        + "=== Редактирование заявки ===" + ln
                        + "Заявка изменена успешно." + ln
                        + "Меню:" + ln
                        + "0. Изменить заявку" + ln
                        + "1. Завершить программу" + ln
                        + "=== Завершение программы ===" + ln
        );
    }

    @Test
    void whenFindAllActionItemTestOutputIsSuccessfully() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));

        Input input = new MockInput(
                new String[] {"0", "1"}
        );

        List<UserAction> actions = new ArrayList<>();
        actions.add(new FindAll(output));
        actions.add(new Exit(output));

        new StartUI(output).init(input, tracker, actions);
        String ln = System.lineSeparator();
        output.toString();
        assertThat(output.toString()).isEqualTo(
                "Меню:" + ln
                        + "0. Найти все заявки" + ln
                        + "1. Завершить программу" + ln
                        + one + ln
                        + "Меню:" + ln
                        + "0. Найти все заявки" + ln
                        + "1. Завершить программу" + ln
                        + "=== Завершение программы ===" + ln
        );
    }

    @Test
    void whenFindByNameActionTestOutputIsSuccessfully() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        String expectedName = "test1";
        Input input = new MockInput(
                new String[] {"0", expectedName, "1"}
        );

        List<UserAction> actions = new ArrayList<>();
        actions.add(new FindByName(output));
        actions.add(new Exit(output));

        new StartUI(output).init(input, tracker, actions);
        String ln = System.lineSeparator();
        output.toString();
        assertThat(output.toString()).isEqualTo(
                "Меню:" + ln
                        + "0. Найти заявку по имени" + ln
                        + "1. Завершить программу" + ln
                        + one + ln
                        + "Меню:" + ln
                        + "0. Найти заявку по имени" + ln
                        + "1. Завершить программу" + ln
                        + "=== Завершение программы ===" + ln
        );
    }

    @Test
    void whenFindByIdActionTestOutputIsSuccessfully() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Input input = new MockInput(
                new String[] {"0", String.valueOf(one.getId()), "1"}
        );

        List<UserAction> actions = new ArrayList<>();
        actions.add(new FindById(output));
        actions.add(new Exit(output));

        new StartUI(output).init(input, tracker, actions);
        String ln = System.lineSeparator();
        output.toString();
        assertThat(output.toString()).isEqualTo(
                "Меню:" + ln
                        + "0. Найти заявку по id" + ln
                        + "1. Завершить программу" + ln
                        + one + ln
                        + "Меню:" + ln
                        + "0. Найти заявку по id" + ln
                        + "1. Завершить программу" + ln
                        + "=== Завершение программы ===" + ln
        );
    }

    @Test
    void whenExit() {
        Output output = new StubOutput();
        Input input = new MockInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();

        List<UserAction> actions = new ArrayList<>();
        actions.add(new Exit(output));

        new StartUI(output).init(input, tracker, actions);
        assertThat(output.toString()).isEqualTo(
                "Меню:" + System.lineSeparator()
                        + "0. Завершить программу" + System.lineSeparator()
                        + "=== Завершение программы ===" + System.lineSeparator()
        );
    }

    @Test
    void whenInvalidExit() {
        Output output = new StubOutput();

        Input input = new MockInput(
                new String[] {"10", "0"}
        );
        Tracker tracker = new Tracker();

        List<UserAction> actions = new ArrayList<>();
        actions.add(new Exit(output));

        new StartUI(output).init(input, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(output.toString()).isEqualTo(
                "Меню:" + ln
                        + "0. Завершить программу" + ln
                        + "Неверный ввод, вы можете выбрать: 0 .. 1" + ln
                        + "Меню:" + ln
                        + "0. Завершить программу" + ln
                        + "=== Завершение программы ===" + ln
        );
    }

}