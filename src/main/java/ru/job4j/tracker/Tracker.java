package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Tracker {
    public final List<Item> items = new ArrayList<>();
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(size++, item);
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    public List<Item> findAll() {
        return new ArrayList<>(items.subList(0, size));
    }

    public List<Item> findByName(String key) {
        List<Item> result = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < size; i++) {
            Item item = items.get(i);
            if (item.getName().equals(key)) {
                result.add(count, item);
                count++;
            }
        }
        return new ArrayList<>(result.subList(0, count));
    }

    private int indexOf(int id) {
        int result = -1;
        for (int i = 0; i < size; i++) {
            if (items.get(i).getId() == id) {
                result = i;
                break;
            }
        }
        return result;
    }

        public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            item.setId(id);
            items.add(index, item);
        }
        return result;
    }

    public void delete(int id) {
        int index = indexOf(id);
        if (index != -1) {
            items.remove(index);
            items.add(size - 1, null);
            size--;
        }
    }
}