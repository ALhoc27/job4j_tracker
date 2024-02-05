package ru.job4j.search;

import java.util.Iterator;
import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();
    int index = 0;

    public void put(Task task) {
        if (tasks.isEmpty()) {
            tasks.add(task);
            return;
        }
        for (Task element : tasks) {
            if (element.getPriority() <= task.getPriority()) {
                index++;
            } else {
                break;
            }
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
