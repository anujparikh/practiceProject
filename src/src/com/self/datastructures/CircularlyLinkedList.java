package src.com.self.datastructures;

import src.com.self.utilities.Node;

/**
 * Created by anujparikh on 9/7/16.
 */
public class CircularlyLinkedList<E> {

    private Node<E> tail = null;
    private int size = 0;

    public CircularlyLinkedList(Node<E> tail) {
        this.tail = tail;
    }

    public void setTail(Node<E> tail) {
        this.tail = tail;
    }

    public Node<E> getTail() {
        return this.tail;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty()) return null;
        return tail.getNext().getElement();
    }

    public E last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }

    public void rotate() {
        if (tail != null) {
            tail = tail.getNext();
        }
    }

    public void addFirst(E element) {
        if (isEmpty()) {
            tail = new Node<E>(element, null);
        } else {
            tail.setNext(new Node<>(element, tail.getNext()));
        }
        size++;
    }

    public void addLast(E element) {
        addFirst(element);
        rotate();
    }

    public E removeFirst() {
        E first = null;
        if (isEmpty()) return first;
        if (size == 1) {
            first = tail.getElement();
            tail = null;
        } else {
            first = tail.getNext().getElement();
            tail.setNext(tail.getNext().getNext());
        }
        return first;
    }
}
