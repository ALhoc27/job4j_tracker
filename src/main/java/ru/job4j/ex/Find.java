package ru.job4j.ex;

public class Find {
    public static String get(String[] data, int index) {
        String result = null;
        try {
            result = data[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Index out of bound");
        }
        return result;
    }
}
