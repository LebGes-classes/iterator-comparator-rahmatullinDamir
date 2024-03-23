package org.example;


import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoubleLinkedListIterator implements Iterator<Integer> {
    Node nextElem;

    public DoubleLinkedListIterator(DoubleLinkedList elem) {
        nextElem = elem.head;
    }

    @Override
    public boolean hasNext() {
        return nextElem != null;
    }

    @Override
    public Integer next() {
        if(!hasNext()) {
            throw new NoSuchElementException();
        }
        Node prev = nextElem;
        Integer value = nextElem.elem;
        nextElem.previous = prev;
        nextElem = nextElem.next;

        return value;
    }

    @Override
    public void remove() {
        Node prev = nextElem.previous;
        Node next = nextElem.next;
        if(!hasNext()){
            nextElem.previous.next = null;
        }
        else {
            prev.next = next;
            next.previous = prev;
        }
    }
}
