package src.com.self.datastructures;

import src.com.self.utilities.Node;

public class SinglyLinkedList<E> {

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public void setHead(Node<E> head) {
        this.head = head;
    }

    public Node<E> getHead() {
        return this.head;
    }

    public void setTail(Node<E> tail) {
        this.tail = tail;
    }

    public Node<E> getTail() {
        return this.tail;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() { return this.size; }

    public E first() {
        if (isEmpty()) {
            return null;
        }
        return head.getElement();
    }

    public E last() {
        if (isEmpty()) {
            return null;
        }
        return tail.getElement();
    }

    public void addFirst(E element) {
        head = new Node<E> (element, head);
        if (size == 0) tail = head;
        size++;
    }

    public void addLast(E element) {
        Node<E> newest = new Node<E>(element, null);
        if (isEmpty()) {
            head = newest;
        } else {
            tail.setNext(newest);
        }
        tail = newest;
        size++;
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        E first = head.getElement();
        head = head.getNext();
        size--;
        if (isEmpty()) tail = null;
        return first;
    }
}
