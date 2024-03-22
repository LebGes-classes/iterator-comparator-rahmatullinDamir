package org.example;
import org.junit.jupiter.api.*;

public class DoubleLinkedListTest {

    int[] myData;
    DoubleLinkedList list;



    @BeforeEach
     void init(){
        int[] myData = {1,2,3,4,5,6,7,8,9};
        list = new DoubleLinkedList(myData);
    }
    @Test
    public void clearTest() {
        list.clear();
        Assertions.assertNull(list.head);
    }

    @Test
    void addIndexInFirstPartTest(){
        list.add(2, 999);
        Assertions.assertEquals(999, list.findByIndex(2));
    }
    @Test
    void addIndexInSecondPartTest(){
        list.add(6, 999);
        Assertions.assertEquals(7, list.findByIndex(7));
    }
    @Test
    void addIndexInHead(){
        list.add(0, 999);
        Assertions.assertEquals(999, list.findByIndex(0));
    }
    @Test
    void addIndexInEnd(){
        list.add(9, 999);
        Assertions.assertEquals(999, list.findByIndex(9));
    }

    @Test
    public void removeTest() {
        list.remove(0);
        Assertions.assertEquals(2, list.findByIndex(0));
    }

    @Test
    public void toStringTest() {
        Assertions.assertEquals("1 2 3 4 5 6 7 8 9 ", list.toString());
    }
    @Test
    void toStringEmptyTest(){
        list.clear();
        Assertions.assertEquals("", list.toString());
    }

    @Test
    void addTest(){
        list.add(999);
        Assertions.assertEquals(999, list.findByIndex(9) );
    }
    @Test
    void isEmptyTest(){
        DoubleLinkedList test = new DoubleLinkedList();
        Assertions.assertTrue(test.isEmpty());
    }
    @Test
    void addIndexTest(){
        list.add(5, 999);
        Assertions.assertEquals(999, list.findByIndex(5));
    }
    @Test
    void  addNegativeIndexTest(){
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> list.add(999, -13));
    }
    @Test
    void addOutOfBounds(){
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> list.add(999, 13));
    }
    @Test
    void findTest(){
        Assertions.assertEquals(6, list.findByIndex(5));
    }
    @Test
    void findOutOfBounds(){
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> list.findByIndex(100));
    }
    @Test
    void removeUndefindIndex() {
        Assertions.assertThrows(IndexOutOfBoundsException.class, () ->  list.remove(-1000));
    }
    @Test
    void removeLastIndex() {
        list.remove(8);
        Assertions.assertEquals(8, list.findByIndex(8));
    }

    @Test
    void removeSecondPartIndex() {
            list.remove(7);
            Assertions.assertEquals(9, list.findByIndex(7));
        }
    @Test
    void removeFirstPartIndex() {
        list.remove(2);
        Assertions.assertEquals(4, list.findByIndex(2));
    }


}

