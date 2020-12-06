package com.academy.telesens.Lesson3_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MethodReturnsArrayInt {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        System.out.println("Вы ввели следующий массив: ");
        System.out.println(Arrays.toString(ReturnsIntArray()));
    }


    public static int[] ReturnsIntArray (){

        System.out.println("Введите размерность массива: ");
        Scanner scanner = new Scanner(System.in);
        int count1 = scanner.nextInt();
        int[] array = new int[count1];

        for (int i=0; i < count1; i++){
            System.out.println(String.format("Введите %dй элемент массива: ", i+1));
            array[i] = scanner.nextInt();
        }

       return array;
    }
}
