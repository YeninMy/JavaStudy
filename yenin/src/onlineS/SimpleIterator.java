package onlineS;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class SimpleIterator<E> {

    public E element;

    public E[] arrays;

    public SimpleIterator(E element) {
    }

    public void add() {
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == null) {
                arrays[i] = element;
                break;
            }
        }
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

    public boolean hasNext(int index) {

        boolean b = false;
        for (E array : arrays) {
            if (arrays[index + 1] != null) {
                b = true;
            }
        }
        return b;
    }

    public void remove(int index) {
        for (E array : arrays) {
            arrays[index] = null;
        }
    }

    public E next(int index) throws NoSuchElementException {
        try {
            return arrays[index + 1];
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException();
        }
    }
    public void findAll() {
        for (int i = 0; i < arrays.length; i ++) {
            if (arrays[i] != null) {
                System.out.println(arrays[i]);
            }

        }

        E[] copyOfArrays = Arrays.copyOf(arrays, ((arrays.length*3)/2)+1);
    }

}
