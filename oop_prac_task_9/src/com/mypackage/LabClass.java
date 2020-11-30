package com.mypackage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class LabClass implements LabClassUI{

    private Trainable[] trainables = new Student[] {};

    LabClass(Trainable[] trainables){
        this.trainables = trainables;
    }

    @Override
    public Trainable find(String name) throws EmptyStringExeption, StudentNotFoundExeption {
        if (name.equals("")) throw new EmptyStringExeption("Empty string");
        Optional<Trainable> optional = Arrays.stream(trainables)
                .filter(x -> (x.getName().equals(name)))
                .findFirst();

        if (!optional.isPresent()) throw new StudentNotFoundExeption("Student not found");
        else
        return optional.get();
    }

    @Override
    public void sort() {
        Comparator<Trainable> comparator = (Trainable a, Trainable b) -> Double.compare(a.getAScore(),b.getAScore());
        Arrays.sort(trainables,comparator);
    }
}
