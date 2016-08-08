package Chapter8DataStructures;

/**
 * Created by papu bhattacharya on 8/8/16.
 */
/*
A double-ended queue (dequeue or deque) is an abstract data type that generalizes a queue, for which elements can be added to or removed from either the front or rear. Deque differs from the queue abstract data type or First-In-First-Out List (FIFO), where elements can only be added to one end and removed from the other. We have given more details on Deque in the previous example

        In this page you will see Deque implementation by using doble linked list.
*/
public class DequeDblLinkedListImpl<T> {

    private Node<T> front;
    private Node<T> rear;

    public static void main(String a[]) {
        DequeDblLinkedListImpl<Integer> deque = new DequeDblLinkedListImpl<Integer>();
        deque.insertFront(34);
        deque.insertFront(67);
        deque.insertFront(29);
        deque.insertFront(765);
        deque.removeFront();
        deque.removeFront();
        deque.removeFront();
        deque.insertRear(43);
        deque.insertRear(83);
        deque.insertRear(84);
        deque.insertRear(546);
        deque.insertRear(356);
        deque.removeRear();
        deque.removeRear();
        deque.removeRear();
        deque.removeRear();
        deque.removeFront();
        deque.removeFront();
        deque.removeFront();
    }

    public void insertFront(T item) {
        //add element at the beginning of the queue
        System.out.println("adding at front: " + item);
        Node<T> nd = new Node<T>();
        nd.setValue(item);
        nd.setNext(front);
        if (front != null) front.setPrev(nd);
        if (front == null) rear = nd;
        front = nd;
    }

    public void insertRear(T item) {
        //add element at the end of the queue
        System.out.println("adding at rear: " + item);
        Node<T> nd = new Node<T>();
        nd.setValue(item);
        nd.setPrev(rear);
        if (rear != null) rear.setNext(nd);
        if (rear == null) front = nd;

        rear = nd;
    }

    public void removeFront() {
        if (front == null) {
            System.out.println("Deque underflow!! unable to remove.");
            return;
        }
        //remove an item from the beginning of the queue
        Node<T> tmpFront = front.getNext();
        if (tmpFront != null) tmpFront.setPrev(null);
        if (tmpFront == null) rear = null;
        System.out.println("removed from front: " + front.getValue());
        front = tmpFront;
    }

    public void removeRear() {
        if (rear == null) {
            System.out.println("Deque underflow!! unable to remove.");
            return;
        }
        //remove an item from the beginning of the queue
        Node<T> tmpRear = rear.getPrev();
        if (tmpRear != null) tmpRear.setNext(null);
        if (tmpRear == null) front = null;
        System.out.println("removed from rear: " + rear.getValue());
        rear = tmpRear;
    }
}

class Node<T> {

    private Node<T> prev;
    private Node<T> next;
    private T value;

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}