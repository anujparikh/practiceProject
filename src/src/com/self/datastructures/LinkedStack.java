package src.com.self.datastructures;

/**
 * Created by anujparikh on 9/8/16.
 */
public class LinkedStack<E> {
    private SinglyLinkedList<E> stack = new SinglyLinkedList<E>();

    public int size() {
        return stack.getSize();
    }

    public boolean isEmpty() {
        return stack.getSize() == 0;
    }

    public void push(E element) {
        stack.addFirst(element);
    }

    public E top() {
        return stack.first();
    }

    public E pop() {
        return stack.removeFirst();
    }
}
