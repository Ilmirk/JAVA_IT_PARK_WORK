package com.company;

/**
 * Created by Student1 on 15.04.2017.
 */
public class Triangle extends Forms implements Figure {
    private int a, b, c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int perimetr() {
        return 0;
    }

    @Override
    public double area() {
        return 0;
    }
}