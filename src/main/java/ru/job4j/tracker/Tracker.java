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
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        Item[] item = new Item[size];
        int sizeFindAll = 0;
        for (int i = 0; i < items.length; i++) {
            Item toCheckForZero = items[i];
            if (toCheckForZero != null) {
                item[i] = toCheckForZero;
                sizeFindAll++;
            }
        }
        return Arrays.copyOf(item, sizeFindAll);
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (item.getName().equals(key)) {
                result[count] = item;
                count++;
            }
        }
        return Arrays.copyOf(result, count);
    }

    private int indexOf(int id) {
        int result = -1;
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                result = i;
                break;
            }
        }
        return result;
    }

    public boolean replace(int id, Item item) {
        int index = -1;
        if (indexOf(id) != -1) {
            item.setId(id);
            index = indexOf(id);
            items[index] = item;
        }
        return index != -1;
    }

    public void delete(int id) {
        int index = indexOf(id);
        if (index != -1) {
            System.arraycopy(items, index + 1, items, index, size - index - 1);
            items[size - 1] = null;
            size--;
        }
    }
}