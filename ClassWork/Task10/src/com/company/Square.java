package com.company;

/**
 * Created by Student1 on 15.04.2017.
 */
public class Square extends Rectangle {
    public Square(int a) {
        super(a, a);
    }

    public boolean equals(Object object) {
        if (object instanceof Square) {
            return super.equals(object);
        } else {
            return false;
        }
    }
}
