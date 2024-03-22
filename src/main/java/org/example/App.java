package org.example;

public class App
{
    public static void main( String[] args )
    {
        int[] myList = {1,2,3,4,5,6,7,8,9};
        DoubleLinkedList list = new DoubleLinkedList(myList);
        list.add(9, 888);
        System.out.println(list.findByIndex(9));;


    }
}
