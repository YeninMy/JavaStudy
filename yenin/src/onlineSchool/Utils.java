package onlineSchool;

import java.util.Arrays;

public class Utils<E> {
    public E element;
    public E[] arrays;

    public Utils(E element) {
    }


    public int size() {
        int arraySize = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] != null) {
                arraySize++;
            }
        }
        return arraySize;
    }


    public boolean isEmpty() {
        int arraySize = 0;
        boolean empty = true;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] != null) {
                arraySize++;
            }
        }
        if (arraySize != 0) {
            empty = false;
        }
        return empty;
    }

    public E get(int index) {
        return arrays[index];
    }

    public void add(E element) {
        for (int i = 0; i < arrays.length; i++) {
            int arraySize = 0;
            if (arrays[i] != null) {
                arraySize++;
            }
            int arraysCounter = (arraySize + 1);
            this.arrays[arraysCounter] = element;
        }
    }

    public void add(int index, E element) {
        for (int i = 0; i < arrays.length; i++) {
            this.arrays[index] = element;
        }
    }


    public void remove(int index) {
        arrays[index] = null;
    }

    public void toColumns() {
        for (int i = 0; i < arrays.length; i++)
            if (arrays[i] != null) {
                System.out.println(arrays[i]);
            }
    }

    @Override
    public String toString() {
        return "Utils{" +
                "arrays=" + Arrays.toString(arrays) +
                '}';
    }
}