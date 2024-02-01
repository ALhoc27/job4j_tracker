package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList arrayList1 = new ArrayList();
        arrayList.add("Petr");
        arrayList.add("Ivan");
        arrayList.add("Stepan");
        arrayList1.add("Petr");
        arrayList1.add("Ivan");
        arrayList1.add("Stepan");

        for (String index : arrayList) {
            System.out.println("index = " + index);
        }

        for (Object index : arrayList1) {
            System.out.println("(String) index = " + (String) index);
        }
    }
}
