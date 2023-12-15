package ru.job4j.tracker;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class UsagePackageDate {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Текущая дата: " + currentDate); // Текущая дата: 2023-12-15

        LocalTime currentTime = LocalTime.now();
        System.out.println("Текущее время: " + currentTime); // Текущее время: 05:59:58.261725

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Текущее дата и время: " + currentDateTime); // Текущее дата и время: 2023-12-15T05:59:58.261822

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String currentDateTimeFormat = currentDateTime.format(formatter);
        System.out.println("Текущее дата и время: " + currentDateTimeFormat); // Текущее дата и время: 15-12-2023 05:59:58

    }
}
