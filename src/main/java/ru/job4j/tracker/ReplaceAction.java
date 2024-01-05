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
        int id = input.askInt("Введите id заявки(которую меняем): ");
        String name = input.askStr("Введите имя новой заявки: ");
        boolean result = tracker.replace(id, new Item(name));
        if (result) {
            System.out.println("Заявка изменена успешно.");
        } else {
            System.out.println("Заявка не изменена");
        }
        return true;
    }
}
