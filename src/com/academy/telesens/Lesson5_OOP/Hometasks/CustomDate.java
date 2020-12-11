package com.academy.telesens.Lesson5_OOP.Hometasks;

import java.util.Scanner;

public class CustomDate {

    private int day;
    private int month;
    private int year;


    public CustomDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public CustomDate() {

    }

    public void setDay(Integer day) {

//        if (day > 31 || day <= 0) {
//            System.out.println("День не может быть " + month );
//        } else {
        this.day = day;
//        }
    }

    public void setMonth(Integer month) {
//        if (month > 12 || month <= 0) {
//            System.out.println("Месяц не может быть " + day );
//        } else {
        this.month = month;
//        }
    }

    public void setYear(Integer year) {

//        if (year <= 0) {
//            System.out.println("Год не может быть " + day);
//        } else {
        this.year = year;
//        }

    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getFormattedDate() {
        return String.format("%d.%d.%d", day, month, year);

    }

    public static boolean validate(int day, int month, int year) {

        Boolean t = true;

        if (day > 31 || day < 1) {
            t = false;
        } else if (day == 31 && (month == 2 || month == 4 || month == 6 || month == 9 || month == 11)) {
            t = false;
        } else if (day >= 1 && month > 12) {
            t = false;
        } else if (year < 1) {
            t = false;
        }

        return t;
    }


}

