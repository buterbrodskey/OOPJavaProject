package com.mypackage;

public class Student implements Trainable {
    private double AScore = 0;
    private String name = "default";

    Student(double AScore, String name ) {
        this.AScore = AScore;
        this.name = name;
    }
    @Override
    public double getAScore() {
        return AScore;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "AScore=" + AScore +
                ", name='" + name + '\'' +
                '}';
    }
}
