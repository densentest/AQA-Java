package com.academy.telesens.Lesson7_Polimorfizm;

import com.academy.telesens.Lesson5_OOP.OOP.Button;
import com.academy.telesens.lesson6_abstraction.*;

public class LessonTaskSavingDifferentTypesToArray {
    public static void main(String[] args) {


        Label label = new Label();
        ButtonForComponent button = new ButtonForComponent();
        CheckBox checkBox = new CheckBox();
        RoundButton roundButton = new RoundButton();

        Component[] array = {label, button, checkBox, roundButton};

        for (int i = 0; i < array.length; i++) {
            array[i].draw();

        }

    }
}