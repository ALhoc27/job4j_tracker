package ru.job4j.search;

import java.util.Iterator;
import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        int index = 0;

        for (Task element : tasks) {
            if (element.getPriority() > task.getPriority()) {
                break;
            }
            index++;
        }
        tasks.add(index, task);
    }

    public Task take() {
        return tasks.poll();
    }

    void getIter() {
        Iterator<Task> iterator = tasks.iterator();
        while (iterator.hasNext()) {
            Task element = iterator.next();
            System.out.println(element);
        }
    }
}
