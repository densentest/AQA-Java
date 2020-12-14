package com.academy.telesens.lesson6_abstraction;

public class Demo {
    public static void main(String[] args) {
        ButtonForComponent buttonForComponent = new ButtonForComponent();
        Label label = new Label();
        RoundButton roundButton = new RoundButton();
        CheckBox checkBox = new CheckBox();

        System.out.println("**********************");
        buttonForComponent.draw();
        buttonForComponent.click();

        System.out.println("**********************");
        roundButton.draw();

        System.out.println("**********************");
        label.draw();

        System.out.println("**********************");
        checkBox.draw();
        checkBox.click();
        System.out.println(checkBox.isChecked());

    }
}
