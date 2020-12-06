package com.academy.telesens.Lesson2;

public class Lessontask5Methods {
    public static void main(String[] args) {
        int n1=1;
        int n2=2;
        int sum1 = n1+n2;

        int sum2 =sum(3,4);
        System.out.println(sum1);
        System.out.println(sum2);

        reverseNumbers(1,2,3);

        printProfile("Den", 28);

    }

    // метод суммы
    public static int sum(int arg1, int arg2){
        int sum = arg1 + arg2;
        return sum;//возвращает результат

    }

    //метод выводит 3 аргумента
    public static void reverseNumbers(int arg1, int arg2, int arg3){
        System.out.print(arg1 + " ");
        System.out.println(arg2 + " " );
        System.out.println(arg3 + " ");

    }

    public static void printProfile (String name, int age){
        System.out.println(String.format("Name %s, age %d", name, age));
    }
}
