package src.com.self.datastructures;

import java.util.Arrays;
import java.util.stream.Stream;

public class Set<E> {
    private Object[] inputArray;
    private Integer size = 0;
    private static final Integer DEFAULT_CAPACITY = 2;

    public Set() {
        inputArray = new Object[DEFAULT_CAPACITY];
    }

    public Boolean add(E inputElement) {
        if (contains(inputElement)) {
            return false;
        }
        if (size == inputArray.length) {
            inputArray = Arrays.copyOf(inputArray, size * 2);
        }
        inputArray[size++] = inputElement;
        return true;
    }

    public void addAll(E[] inputElements) {
        Stream.of(inputElements).forEach(this::add);
    }

    @SuppressWarnings("unchecked")
    public E get(Integer index) {
        return (E) inputArray[index];
    }

    public void remove(E inputElement) {
        Integer i = 0;
        for(Object element: inputArray) {
            if (element == inputElement) {
                System.arraycopy(inputArray, i + 1, inputArray, i, inputArray.length - i - 1);
                return;
            }
            i++;
        }
    }

    public void clear() {
        inputArray = null;
        size = 0;
    }

    public Boolean contains(E inputElement) {
        return Stream.of(inputArray).filter(element -> element != null).anyMatch(element -> element.equals(inputElement));
    }

    public Boolean containsAll(E[] inputElements) {
        return Stream.of(inputElements).filter(element -> element != null).allMatch(this::contains);
    }

    public Boolean isEmpty() {
        return size == 0;
    }
}