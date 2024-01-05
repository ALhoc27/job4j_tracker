package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    private final Output output;

    public ReplaceAction(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Изменить заявку";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Редактирование заявки ===");
        int id = input.askInt("Введите id: ");
        String name = input.askStr("Введите имя: ");
        boolean result = tracker.replace(id, new Item(name));
        if (result) {
            output.println("Заявка изменена успешно.");
        } else {
            output.println("Заявка не изменена");
        }
        return true;
    }
}
