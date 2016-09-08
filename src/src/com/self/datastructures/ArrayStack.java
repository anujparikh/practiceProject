package src.com.self.datastructures;

import java.util.Arrays;

/**
 * Created by anujparikh on 9/8/16.
 */
@SuppressWarnings("unchecked")
public class ArrayStack<E> {

    public static final int CAPACITY = 10;
    private E[] arrayStack;
    private int size = 0;

    public ArrayStack() {
        this.arrayStack = (E[]) new Object[CAPACITY];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean push(E element) {
        try {
            if (size >= arrayStack.length) {
                Arrays.copyOf(arrayStack, size * 2);
            }
            arrayStack[size++] = element;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public E top() {
        if (size == 0) return null;
        return arrayStack[size];
    }

    public E pop() {
        if (isEmpty()) return null;
        E poped = arrayStack[size];
        arrayStack[size--] = null;
        return poped;
    }
}
