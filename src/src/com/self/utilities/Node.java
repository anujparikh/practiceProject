package src.com.self.utilities;

/**
 * Created by anujparikh on 9/7/16.
 */
public class Node<E> {
    private E element;
    private Node<E> next;
    private Node<E> prev;

    public Node(E element, Node<E> prev, Node<E> next) {
        this(element, next);
        this.prev = prev;
    }

    public Node(E element, Node<E> next) {
        this.element = element;
        this.next = next;
        this.prev = null;
    }

    public E getElement() {
        return this.element;
    }

    public Node<E> getNext() {
        return this.next;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public void setPrev(Node<E> prev) {
        this.prev = prev;
    }

    public Node<E> getPrev() {
        return this.prev;
    }
}
