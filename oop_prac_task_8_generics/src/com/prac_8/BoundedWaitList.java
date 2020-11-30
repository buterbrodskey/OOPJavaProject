package com.prac_8;

public class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;

    BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(E element) {
        if (concurrentLinkedQueue.size() < capacity)
        concurrentLinkedQueue.add(element);
        else System.out.println("Список полон!");
    }
}
