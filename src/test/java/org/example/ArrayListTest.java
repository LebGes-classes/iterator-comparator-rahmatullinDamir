package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.naming.SizeLimitExceededException;

public class ArrayListTest {
    ArrayList list;
    int capacity;

    @BeforeEach
    void init() throws SizeLimitExceededException {
        capacity = 1;
        list = new ArrayList(capacity);
    }

    @Test
    void addToEndTestWithNormalCapacityTest() {
        list.add(12);
        list.add(12);
        list.add(12);
        Assertions.assertEquals(12, list.findByIndex(0));
    }

    @Test
    void addToEndTestWithNullCapacityTest() {
        capacity = 0;
        Assertions.assertThrows(SizeLimitExceededException.class, () -> new ArrayList(capacity));
    }


    @Test
    void addToIndexTest() {
        list = new ArrayList();
        list.add(17,1);
        Assertions.assertEquals(1, list.findByIndex(17));
    }
    @Test
    void addToIndexTestBiggerCapacity() {
        list = new ArrayList();
        list.add(17,1);
        Assertions.assertEquals(1, list.findByIndex(17));
    }
    @Test
    void addToIndexTestBLowerThanNull() {
        list = new ArrayList();
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> list.add(-11,1));
    }

    @Test
    void clearArrayTest(){
        list.clear();
        Assertions.assertNull(list.array);
    }

    @Test
    void isEmptyTest() {
        list.clear();
        Assertions.assertEquals(true, list.isEmpty());
    }

    @Test
    void toStringTest() {
        list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        Assertions.assertEquals("1 2 3", list.toString());
    }

    @Test
    void removeTest() {
        list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.remove(1);
        Assertions.assertEquals(2 , list.findByIndex(0));
    }


}
