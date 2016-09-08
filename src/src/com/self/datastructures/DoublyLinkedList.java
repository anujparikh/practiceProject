package src.com.self.datastructures;

import src.com.self.utilities.Node;

/**
 * Created by anujparikh on 9/7/16.
 */
public class DoublyLinkedList<E> {
    private Node<E> header;
    private Node<E> tailer;
    private int size = 0;

    public DoublyLinkedList(Node<E> header, Node<E> tailer, int size) {
        this.header = header;
        this.tailer = tailer;
        this.size = size;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty()) return null;
        return header.getNext().getElement();
    }

    public E last() {
        if (isEmpty()) return null;
        return tailer.getPrev().getElement();
    }

    public void addFirst(E element) {
        Node<E> newElement = new Node<E>(element, header, header.getNext());
        header.getNext().setPrev(newElement);
        header.setNext(newElement);
        size++;
    }

    public void addLast(E element) {
        Node<E> newElement = new Node<E>(element, tailer.getPrev(), tailer);
        tailer.getPrev().setNext(newElement);
        tailer.setPrev(newElement);
        size++;
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        E first = header.getNext().getElement();
        Node<E> newFirst = header.getNext().getNext();
        header.setNext(newFirst);
        newFirst.setPrev(header);
        size--;
        return first;
    }

    public E removeLast() {
        if (isEmpty()) return null;
        E last = tailer.getPrev().getElement();
        Node<E> newLast = tailer.getPrev().getPrev();
        tailer.setPrev(newLast);
        newLast.setNext(tailer);
        size--;
        return last;
    }
}
