package com.academy.telesens.Lesson9_Exceptions.HomeTask;

import com.academy.telesens.Lesson5_OOP.Hometasks.CustomDate;

public class CustomDateException {

    private int day;
    private int month;
    private int year;


    public CustomDateException(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public CustomDateException(int day, int m) throws IllegalDateException {
//
//        if (day > 31 || day < 1) {
//            throw new IllegalDateException("День не может быть больше 31 или меньше 1");
//        }
//
//        if (day == 31 && monthDoesntHave31Day(month)) {
//            throw new IllegalDateException("В этом месяце не может быть 31 день");
//        }
//
//        if (month > 12 || month < 1) {
//            throw new IllegalDateException("Месяц не может быть больше 12 или меньше 1");
//        }
//        if (year < 1) {
//            throw new IllegalDateException("Год не может быть отрицательным");
//        }
//        if (month == 2 && day > 29 && isLeapYear(year)) {
//            throw new IllegalDateException("Это высокосный год, в феврале не может быть больше 29 дней");
//        }
//        if (month == 2 && day > 28 && !isLeapYear(year)) {
//            throw new IllegalDateException("Это не высокосный год, в феврале не может быть больше 28 дней");
//        }
    }
}

