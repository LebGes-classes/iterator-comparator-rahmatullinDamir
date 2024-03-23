package org.example;

public interface ListInterface {
    void add(Integer elem);
    void add(int index,  Integer elem);
    void clear();
    void remove(int index);
    Integer findByIndex(int index);
    boolean isEmpty();
}
