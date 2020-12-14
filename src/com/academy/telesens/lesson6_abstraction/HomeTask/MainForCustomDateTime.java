package com.academy.telesens.lesson6_abstraction.HomeTask;

import com.academy.telesens.Lesson5_OOP.Hometasks.CustomDate;

import java.util.Scanner;

public class MainForCustomDateTime {
    public static void main(String[] args) {
        CustomDateTime fullDate = new CustomDateTime();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите день: ");
        fullDate.setDay(scanner.nextInt());

        System.out.println("Введите месяц: ");
        fullDate.setMonth(scanner.nextInt());

        System.out.println("Введите год: ");
        fullDate.setYear(scanner.nextInt());

        System.out.println("Введите текущее время: ");

        System.out.println("Введите час: ");
        fullDate.setHour(scanner.nextInt());
        System.out.println("Введите минуту: ");
        fullDate.setMinute(scanner.nextInt());
        System.out.println("Введите секунду: ");
        fullDate.setSecond(scanner.nextInt());

        String finalDate = fullDate.getFormattedDate();
        System.out.println(finalDate);

    }
}
