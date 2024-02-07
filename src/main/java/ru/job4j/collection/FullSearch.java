package ru.job4j.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FullSearch {

    Set<String> extractNumber(List<Task> index) {
        Set<String> setIndex = new HashSet<>();

        for (Task in : index) {
            setIndex.add(in.getNumber());
        }
        return setIndex;
    }
}