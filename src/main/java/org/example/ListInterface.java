package org.example;

public interface ListInterface {
    void add(int elem);
    void add(int index, int elem);
    void clear();
    void remove(int elem);
    int findByIndex(int index);
    boolean isEmpty();
}
