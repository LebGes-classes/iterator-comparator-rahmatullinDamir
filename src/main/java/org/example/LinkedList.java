package org.example;

// class work done!
public class LinkedList implements ListInterface {
    static class Node {
        int elem;
        Node next;

        Node(int elem){
            this.elem = elem;
            this.next = null;
        }
    }

    Node first;
    Node last;

    LinkedList(){
        first = null;
        last = null;
    }
    LinkedList(int[] data) {
        for(int elemToAdd: data) {
            add(elemToAdd);
        }
    }

    @Override
    public void add(int elem) {
        Node currElem = new Node(elem);
        if (this.isEmpty()) {
            first = currElem;
            last = currElem;
            return;
        }
        last.next = currElem;
        last = currElem;
    }

    @Override
    public void add(int index, int elem) {
        Node elemToAdd = new Node(elem);
        if (index == 0) {
            elemToAdd.next = first;
            first = elemToAdd;
            return;
        }
        Node currElem = first;
        int cnt = 0;
        while (cnt < index - 1){
            currElem = currElem.next;
            cnt++;
        }

        if (currElem.next == null){
            last = elemToAdd;
        }
        elemToAdd.next = currElem.next;
        currElem.next = elemToAdd;
    }

    @Override
    public void clear() {
        Node currElem = first;
        while(currElem.next != null) {
            Node tempElem = currElem;
            currElem = currElem.next;
            tempElem.next = null;
        }
        first = null;
    }

    @Override
    public void remove(int index) {

        if (index == 0) {
            Node temp = first;
            first = temp.next;
            return;
        }

        Node currElem = first;
        Node nextElem = first.next;

        int cnt = 0;

        while(cnt < index - 1) {
            currElem = currElem.next;
            nextElem = nextElem.next;
            cnt++;
        }

        currElem.next = nextElem.next;
    }

    @Override
    public int findByIndex(int index) {
        Node currElem = first;
        int cnt = 0;
        while (cnt < index) {
            currElem = currElem.next;
            cnt++;
        }
        return currElem.elem;
    }

//    @Override
//    public int findByElem(int elem) {
//        Node currElem = first;
//        int cnt = 0;
//        while (currElem.elem != elem) {
//            currElem = currElem.next;
//            cnt++;
//        }
//        return cnt;
//    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

//    @Override
//    public void print() {
//        Node currElem = first;
//        if (isEmpty()) {
//            return;
//        }
//        while(currElem != null) {
//            System.out.print(currElem.elem + " " );
//            currElem = currElem.next;
//        }
//    }
}
