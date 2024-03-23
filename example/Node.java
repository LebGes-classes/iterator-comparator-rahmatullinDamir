package org.example;

class Node {
    Integer elem;
    Node next;
    Node previous;

    Node(Integer elem) {
        this.elem = elem;
        next = null;
        previous = null;
    }
}