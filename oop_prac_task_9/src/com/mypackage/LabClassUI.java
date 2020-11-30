package com.mypackage;

public interface LabClassUI {

    Trainable find(String name) throws EmptyStringExeption, StudentNotFoundExeption;

    void sort();
}
