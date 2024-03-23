package org.example;

import java.util.Comparator;

public class DoubleLinkedListComparator implements Comparator<Node> {

    @Override
    public int compare(Node o1, Node o2) {
        return o1.elem - o2.elem;
    }
}
