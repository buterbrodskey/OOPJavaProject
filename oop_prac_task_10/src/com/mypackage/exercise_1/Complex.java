package com.mypackage.exercise_1;

public class Complex {

    int real = 0,image = 0;

    public Complex() {
    }

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    @Override
    public String toString() {
        return "Complex{ " +
                 real +
                " + " + image +
                "i }";
    }
}
