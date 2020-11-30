package com.mypackage;

import com.mypackage.exercise_1.*;
import com.mypackage.exercise_2.*;
import com.mypackage.exercise_3.*;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // EXERCISE 1
        {
            ComplexAbstractFactory factory = new ConcreteFactory();
            Complex someDefaultComplex = factory.createComplex(); // со значениями по умолчанию

            Complex someDefineComplex = factory.CreateComplex(4, 5); // с заданными значениями

            System.out.println(someDefineComplex);
            System.out.println(someDefaultComplex);
        }
        // EXERCISE 2
        {
            System.out.println();

            Client client = new Client();
            AbstractChairFactory chairFactory = new ChairFactory();

            client.setChair(chairFactory.getChair(ChairType.MagicChair));
            client.sit();

            client.setChair(chairFactory.getChair(ChairType.VictorianChair));
            client.sit();

            client.setChair(chairFactory.getChair(ChairType.FunctionalChair));
            client.sit();
        }
        // EXERCISE 3
        System.out.println();

        EditorGUI editorGUI = new EditorGUI();
    }
}
