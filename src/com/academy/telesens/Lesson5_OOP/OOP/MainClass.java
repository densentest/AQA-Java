package com.academy.telesens.Lesson5_OOP.OOP;

public class MainClass {
    public static void main(String[] args) {
        Person me = new Person();
        me.setFirstName("Den");
        me.setLastName("Sennikov");
        me.setAge(28);
        me.setGender('m');

        String finalStringofMe =  me.getProfile();
        System.out.println(finalStringofMe);


        Person me1 = new Person("Den", "Sennikov", 28, 'm');
        String finalStringOfMe1 = me1.getProfile();
        System.out.println(finalStringOfMe1);


    }
}
