package com.mypackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, EmptyStringExeption {
        
        final int studentNumber = 4;

        Trainable[] trainables = new Student[studentNumber];

        //Массив заполню из файла
        File file = new File("src\\StudInfo.txt");
        Scanner scanner = new Scanner(file);

        for (int i =0; i < trainables.length; i++) {
            trainables[i] = (Trainable) new Student(scanner.nextDouble(),scanner.next());
        }

        LabClass labClass = new LabClass(trainables);
        System.out.println("Поиск по имени: ");
        try {
            System.out.println(labClass.find("Alex"));
        }

        catch (EmptyStringExeption e) {
            System.out.println("Empty string");
        }

        catch (StudentNotFoundExeption e) {
            System.out.println("Student not found");
        }

        System.out.println("\nНесортированный массив:\n ");
        Arrays.stream(trainables).forEach(System.out::println);
        labClass.sort();
        System.out.println("\nСортированный массив:\n ");
        Arrays.stream(trainables).forEach(System.out::println);
    }
}
