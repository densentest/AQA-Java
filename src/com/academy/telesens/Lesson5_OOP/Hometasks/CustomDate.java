package com.academy.telesens.Lesson5_OOP.Hometasks;

import java.util.Scanner;

public class CustomDate {

    private int day = 1;
    private int month = 1;
    private int year = 1889;


    public CustomDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public CustomDate(){

    }

    public void setDay (Integer day){

        if (day > 31 || day <=0 ){
            System.out.println("День не может быть " + day + ". День будет установлен в 1");
        }
        else {
            this.day = day;
        }
    }

    public void setMonth (Integer month){
        if (month > 12 || month <=0 ){
            System.out.println("Месяц не может быть " + day + ". День будет установлен в 1");
        }
        else {
            this.month = month;
        }
    }

    public void setYear (Integer year){

        if (year <=0 ){
            System.out.println("Год не может быть " + day + ". День будет установлен в 1889");
        }
        else {
            this.year = year;
        }

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

    public String getFormattedDate (){
        return String.format("%d.%d.%d", day, month,year);

    }
}
