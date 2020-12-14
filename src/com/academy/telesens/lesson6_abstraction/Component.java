package com.academy.telesens.lesson6_abstraction;

public abstract class Component {
    protected int xPosition;
    protected int yPosition;
    protected int width;
    protected int height;
    protected String text;

    abstract public void draw();
}
