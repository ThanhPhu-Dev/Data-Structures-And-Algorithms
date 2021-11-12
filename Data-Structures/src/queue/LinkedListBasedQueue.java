package queue;

import linkedList.DefaultDoublyLinkedList;
import linkedList.DoublyLinkedList;

import java.util.Iterator;

public class LinkedListBasedQueue<T> implements QueueADT<T>{
    private final DoublyLinkedList<T> linkedList = new DefaultDoublyLinkedList<>();

    public LinkedListBasedQueue() {
    }

    public LinkedListBasedQueue(T element) {
        enQueue(element);
    }


    @Override
    public void enQueue(T element) {
        linkedList.addLast(element);
    }

    @Override
    public T deQueue() {
        return linkedList.removeFirst();
    }

    @Override
    public T peek() {
        return linkedList.peekFirst();
    }

    @Override
    public int size() {
        return linkedList.size();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public Iterator<T> iterator() {
        return linkedList.iterator();
    }
}
