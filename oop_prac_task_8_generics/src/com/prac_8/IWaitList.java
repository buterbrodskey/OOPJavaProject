package com.prac_8;

import javax.lang.model.element.Element;
import java.util.Collection;

public interface IWaitList<E> {
    void add(E element);

    void remove(E element);

    boolean contains(E element);

    boolean containsAll(Collection<E> c);

    boolean isEmpty();
}
