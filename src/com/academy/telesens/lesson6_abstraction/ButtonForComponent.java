package com.academy.telesens.lesson6_abstraction;

public class ButtonForComponent extends Component {
    @Override
    public void draw() {
        System.out.println("Button: draw");
    }

    public void click() {
        System.out.println("Button: click");

    }
}
