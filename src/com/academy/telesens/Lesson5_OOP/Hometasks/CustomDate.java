package com.academy.telesens.Lesson5_OOP.Hometasks;

public class CustomDate {

    private int day = 01;
    private int month = 01;
    private int year = 01;


    public CustomDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay (Integer day){
        this.day = day;
    }

    public void setMonth (Integer month){
        this.month = month;
    }

    public void setYear (Integer year){
        this.year = year;
    }

}
