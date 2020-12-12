package com.academy.telesens.Lesson5_OOP.OOP;

public class Operator {

    private String name;
    private String address;

    public Operator(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Operator (){

    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }


}
