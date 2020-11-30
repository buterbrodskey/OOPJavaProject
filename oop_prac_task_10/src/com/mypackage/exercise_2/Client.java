package com.mypackage.exercise_2;

public class Client {
    Chair chair;
    public void sit() {
        System.out.println("The client is sitting on a " + chair.getClass().getSimpleName());
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

}
