package com.prac_8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int listCapacity = 3;

        List<String> list_true = new ArrayList<>();
        list_true.add("a");
        list_true.add("b");

        List<String> list_false = new ArrayList<>();
        list_false.add("c");
        list_false.add("f");


        BoundedWaitList<String> boundedWaitList = new BoundedWaitList<>(listCapacity);
        {
            boundedWaitList.add("a");
            boundedWaitList.add("b");
            boundedWaitList.add("c");
            boundedWaitList.add("d"); // не добавит из-за ограниченного
            boundedWaitList.add("f"); //  capacity, заданного мной выше
       }

        System.out.println("Текущая ёмкость: " +boundedWaitList.getCapacity());

        System.out.println(boundedWaitList.toString());

        System.out.println(boundedWaitList.contains("a"));
        System.out.println(boundedWaitList.contains("g"));

        System.out.println(boundedWaitList.containsAll(list_true));
        System.out.println(boundedWaitList.containsAll(list_false));


        UnfairWaitList<String> unfairWaitList = new UnfairWaitList<>();
        {
            unfairWaitList.add("a");
            unfairWaitList.add("b");
            unfairWaitList.add("c");
            unfairWaitList.add("d");
        }

        unfairWaitList.remove("a"); // не удаляет первый элемент
        System.out.println(unfairWaitList.toString());

        unfairWaitList.remove("d"); // удаляет люобой, кроме первого
        System.out.println(unfairWaitList.toString());

        unfairWaitList.moveToBack();
        unfairWaitList.moveToBack();
        unfairWaitList.moveToBack();

        System.out.println(unfairWaitList.toString());

    }
}
