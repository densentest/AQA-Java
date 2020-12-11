package com.academy.telesens.Lesson5_OOP.Hometasks;

import java.util.Scanner;

public class MainClassForDate {
    public static void main(String[] args) {
        CustomDate fulldate = new CustomDate();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите день: ");
        fulldate.setDay(scanner.nextInt());

        System.out.println("Введите месяц: ");
        fulldate.setMonth(scanner.nextInt());

        System.out.println("Введите год: ");
        fulldate.setYear(scanner.nextInt());

        String finalDate = fulldate.getFormattedDate();
        System.out.println(finalDate);

    }
}
