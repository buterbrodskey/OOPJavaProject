package com.prac_8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();


    WaitList() {
    }

    WaitList(Collection<E> c) {
        concurrentLinkedQueue.addAll(c);
    }

    @Override
    public String toString() {
        return concurrentLinkedQueue.toString();
    }

    @Override
    public void add(E element) {
        concurrentLinkedQueue.add(element);
    }

    @Override
    public void remove(E element) {
        concurrentLinkedQueue.remove(element);
    }

    @Override
    public boolean contains(E element) {
        return concurrentLinkedQueue.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return concurrentLinkedQueue.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return concurrentLinkedQueue.isEmpty();
    }
}
