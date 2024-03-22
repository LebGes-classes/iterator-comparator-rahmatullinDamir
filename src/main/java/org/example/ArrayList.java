package org.example;

import javax.naming.SizeLimitExceededException;

public class ArrayList implements ListInterface{
    int size;
    int capacity;
    int[] array;

    public ArrayList() {
        capacity = 16;
        array = new int[capacity];
    }

    public ArrayList(int capacity) throws SizeLimitExceededException {
        if (capacity == 0) {
            throw new SizeLimitExceededException();
        }
        this.capacity = capacity;
        array = new int[capacity];
    }

    public void increaseCapacity() {
        capacity = capacity * 2;
        int[] newArray = new int[capacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }
    @Override
    public void add(int elem) {
        if (size  >= capacity) {
            increaseCapacity();
        }
         array[size] = elem;
         size++;
    }

    @Override
    public void add(int index, int elem) {
        if (index >= capacity ) {
            increaseCapacity();
        }
        else if (index < 0) {
            throw new IndexOutOfBoundsException();
        }
        array[capacity - 1] = elem;
        for(int i = 0; i < (capacity - index - 1); i++){
            int tmp = array[capacity - i - 1];
            array[capacity - i - 1] = array[capacity - i - 2];
            array[capacity - i - 2] = tmp;
        }
        size++;
    }

    @Override
    public void clear() {
        array = null;
        size = 0;
        capacity = 0;
    }

    @Override
    public void remove(int elem) {
        boolean flag;
        int cnt = 0;
        int[] newArray = new int[size - 1];
        for(int i = 0; i < size; i++) {
            flag = true;
            if (array[i] == elem) {
                flag = false;
                cnt--;
            }
            if (flag) {
                newArray[cnt] = array[i];
            }
            cnt++;
        }
        size--;
        array = newArray;
    }

    @Override
    public int findByIndex(int index) {
        return array[index];
    }

//    public int findByElem(int elem) {
//        for(int i = 0; i < size; i++) {
//            if(array[i] == elem){
//                return array[i];
//            }
//        }
//        throw new NoSuchElementException();
//    }

    @Override
    public boolean isEmpty() {
        return  array == null;
    }

    @Override
    public String toString() {
        String toReturn = "";
        for(int i = 0; i < size; i++){
            if (i != size - 1) {
                toReturn  += array[i] + " ";
            }
            else {
                toReturn += array[i];
            }
        }

        return toReturn;
    }
}
