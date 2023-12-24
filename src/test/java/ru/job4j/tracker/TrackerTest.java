package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TrackerTest {

    @Test
    public void whenTestFindById() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        Item bug1 = new Item("Bug1");
        Item bug2 = new Item("Bug2");
        Item bug3 = new Item("Bug3");
        tracker.add(bug);
        Item item1 = tracker.add(bug1);
        Item item2 = tracker.add(bug2);
        Item item3 = tracker.add(bug3);
        System.out.println(item2.getName());
        Item result = tracker.findById(item2.getId());
        System.out.println(result.getName());
        assertThat(result.getName()).isEqualTo(item2.getName());
    }

    @Test
    public void whenTestFindAll() {
        Tracker tracker = new Tracker();
        Item first = new Item("First");
        Item second = new Item("Second");
        Item three = new Item("Three");
        tracker.add(first);
        tracker.add(second);
        tracker.add(three);
        Item result = tracker.findAll()[2];
        assertThat(result.getName()).isEqualTo(three.getName());
    }

    @Test
    public void whenTestFindByNameCheckArrayLength() {
        Tracker tracker = new Tracker();
        Item first = new Item("First");
        Item second = new Item("Second");
        tracker.add(first);
        tracker.add(second);
        tracker.add(new Item("1232"));
        tracker.add(new Item("First"));
        tracker.add(new Item("First"));
        Item[] result = tracker.findByName("First");
        assertThat(result.length).isEqualTo(3);
    }

    @Test
    public void whenTestFindByNameCheckSecondItemName() {
        Tracker tracker = new Tracker();
        Item first = new Item("First");
        Item second = new Item("Second");
        tracker.add(first);
        tracker.add(second);
        tracker.add(new Item("First"));
        tracker.add(new Item("Second"));
        tracker.add(new Item("First"));
        Item[] result = tracker.findByName(second.getName());
        assertThat(result[1].getName()).isEqualTo(second.getName());
    }

}