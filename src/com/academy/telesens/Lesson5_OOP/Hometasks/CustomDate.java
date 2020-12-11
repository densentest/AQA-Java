package com.academy.telesens.Lesson5_OOP.Hometasks;

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
        this.day = day;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public void setYear(Integer year) {
        this.year = year;
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

    private static boolean isLeapYear(int year) {
        if ((year % 4) == 0) {
            return true;
        }

        return false;
    }

    public static boolean validate(int day, int month, int year) {


        if (day > 31 || day < 1) {
            return false;
        }

        if (day == 31 && (month == 2 || month == 4 || month == 6 || month == 9 || month == 11)) {
            return false;
        }

        if (month > 12) {
            return false;
        }
        if (year < 1) {
            return false;
        }
        if (month == 2 && day > 29 && isLeapYear(year)) {
            return false;
        }
        if (month == 2 && day > 28 && !isLeapYear(year)) {
            return false;
        } else return true;
    }


}

