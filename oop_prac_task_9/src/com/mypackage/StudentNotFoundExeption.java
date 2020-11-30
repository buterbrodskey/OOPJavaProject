package com.mypackage;

public class StudentNotFoundExeption extends Exception {
    StudentNotFoundExeption(String errorMessage) {
        super(errorMessage);
    }
}
