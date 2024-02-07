package ru.job4j.queue;

import java.util.Queue;

public class AppleStore {
    private final Queue<Customer> queue;

    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        String str = null;
        for (int i = 0; i < count; i++) {
            str = queue.poll().name();
        }
        return str;
    }

    public String getFirstUpsetCustomer() {
        String str = null;
        int in = count + 1;
        for (int i = 0; i < in; i++) {
           str = queue.poll().name();
        }
        return str;
    }
}
