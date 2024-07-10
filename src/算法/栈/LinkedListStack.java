package 算法.栈;

import java.util.Iterator;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/5/24 7:46
 */
public class LinkedListStack<E> implements Stack<E>, Iterable<E> {
    int size;
    int capacity;
    Node head = new Node(null, null);

    public LinkedListStack(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node<E> p = head;
            @Override
            public boolean hasNext() {
                return p.next != null;
            }

            @Override
            public E next() {
                E e = p.next.value;
                p = p.next;
                return e;
            }
        };
    }

    @Override
    public boolean push(E e) {
        if(isFull())
        return false;
        head.next = new Node<E>(e, head.next);
        size ++;
        return true;
    }

    @Override
    public E pop() {
        if(isEmpty())
        return null;
        Node<E> e = head.next;
        head = head.next;
        size --;
        return e.value;
    }

    @Override
    public E peek() {
        if(isEmpty())
            return null;
        Node<E> e = head.next;
        return e.value;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == capacity;
    }

    private static class Node<E> {
        E value;
        Node<E> next;

        private Node(E e, Node<E> next) {
            this.value = e;
            this.next = next;
        }
    }

}
