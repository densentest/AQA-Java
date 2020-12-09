package com.academy.telesens.Lesson3_4;

import java.util.Scanner;

public class HomeClass3 {
    public static void main(String[] args) {
        ReadStringOutputSubstringInStringAndCountIt();
    }

    public  static void ReadStringOutputSubstringInStringAndCountIt (){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String string1 = scanner.nextLine();
        System.out.println("Вы ввели следующую строку: " + string1);

        System.out.println("Проверим наличие подстроки java в введенной строке!");
        System.out.println();


        for (int i = 0; i < string1.length(); i++){
            int k = string1.indexOf("java");
                String substringJava = string1.substring(k, k + 4);
                if (substringJava.equals("java")) {
                    System.out.println("Подстрока " + substringJava + " найдена в строке");
                    break;

                }


        }

        String[] arrayOfJava = string1.split("java");
        int javaCount = arrayOfJava.length;
        System.out.println(String.format("Подстрока 'java' встречается в строке '%s', %d раз(а)", string1, javaCount));

        //не работает если ввести следующую строку "javaksksks java   javasaa" или просто "java"
        // в других кейсах работает
        //может завтра еще додумаю(

    }
}
