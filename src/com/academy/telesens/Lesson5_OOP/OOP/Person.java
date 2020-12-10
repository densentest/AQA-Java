package com.academy.telesens.Lesson5_OOP.OOP;

public class Person {

    private String firstName;
    private String lastName;
    private Integer age;
    private Character gender;


    public Person(String firstName, String lastName, Integer age, Character gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public Person(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Character getGender() {
        return gender;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public String getProfile(){
        return String.format("First name: %s\n Last name: %s\n Age: %s\n Gender: %s",
                firstName, lastName, age, gender);
    }
}
