package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Objects;

public class Tracker {
    public final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < items.length; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        Item[] result = new Item[size];
        int sizeFindAll = 0;
        for (int i = 0; i < items.length; i++) {
            Item toCheckForZero = items[i];
            if (toCheckForZero != null) {
                result[i] = toCheckForZero;
                sizeFindAll++;
            }
        }
        return Arrays.copyOf(result, sizeFindAll);
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[findAll().length];
        int sizeFindAll = 0;
        for (int i = 0; i < findAll().length; i++) {
            Item toChekFor = items[i];
            if (toChekFor.getName().equals(key)) {
                result[i] = findAll()[i];
                sizeFindAll++;
            }
        }
        return Arrays.copyOf(result, sizeFindAll);
    }
}