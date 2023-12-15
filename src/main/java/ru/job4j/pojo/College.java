package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Date date = new Date();
        Student peterArsentiev = new Student();
        peterArsentiev.setFullName("Peter Arsentiev");
        peterArsentiev.setGroup(213);
        peterArsentiev.setDateOfReceipt(date);
        String dataFormat = String.format("%1$td %1$tB %1$tY", date);

        System.out.println("Студент: " + peterArsentiev.getFullName() + " из группы - " + peterArsentiev.getGroup() + " (запись от: " + dataFormat + ")");
    }
}