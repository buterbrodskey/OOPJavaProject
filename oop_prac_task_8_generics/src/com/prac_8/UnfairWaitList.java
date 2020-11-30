package com.prac_8;

import javax.lang.model.element.Element;
import java.util.Collection;
import java.util.Iterator;

public class UnfairWaitList<E> extends WaitList<E>{

    UnfairWaitList() {
    }



    public void remove(E element) {
        if (concurrentLinkedQueue.contains(element)) {

            Iterator it = concurrentLinkedQueue.iterator();

            it.next();

            while (it.hasNext()) {
                if ((E) it.next() == (element)) {
                    it.remove();
                    break;
                }
            }

        }
        else System.out.println("Не удалось, данный элемент не содержится в списке.");
    }

    public void moveToBack() {
        if (!concurrentLinkedQueue.isEmpty() || concurrentLinkedQueue.size() == 1) {
            Iterator it = concurrentLinkedQueue.stream().iterator();
            concurrentLinkedQueue.add(concurrentLinkedQueue.poll());



        }
    }

}
