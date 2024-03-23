package org.example;

import javax.naming.SizeLimitExceededException;
import javax.sound.midi.Soundbank;
import java.util.Iterator;


public class App
{
    public static void main(String[] args ) throws SizeLimitExceededException {
        Integer[] myList = {12,2121,322,41,5983,633,7,8,9};
        String[] listis = {"beb", "bab"};
        DoubleLinkedList list = new DoubleLinkedList(myList);
        DoubleLinkedListIterator iter = new DoubleLinkedListIterator(list);
        int cnt = 0;
        while (iter.hasNext()){
            cnt++;
            if(cnt == 2){
                iter.remove();
            }
            System.out.println(iter.next());
        }
        System.out.println(list);
//        while(listIterator.hasNext()){
//            System.out.println(listIterator.next());
//        }


//        ArrayList<String> listArr = new ArrayList<>();
//        for (String str: list) {
//            System.out.println(str);
//        }
//        System.out.println(listArr);


    }
}
