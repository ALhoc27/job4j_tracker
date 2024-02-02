package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Petr");
        arrayList.add("Ivan");
        arrayList.add("Stepan");

        for (String index : arrayList) {
            System.out.println("index = " + index);
        }

    }
}
