package 算法.队列;

import java.util.Iterator;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/5/31 19:58
 */
public class LinkedListDequeue<E> implements Deque<E>, Iterable<E> {
    int capacity;
    Node<E> sentinel = new Node<>(null, null, null);
    int size;

    public LinkedListDequeue(int capacity) {
        this.capacity = capacity;
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
    }


    @Override
    public boolean isEmpty() {

        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == capacity;
    }

    @Override
    public boolean offerFirst(E e) {
        if(isFull())
        return false;
        Node<E> a = sentinel;
        Node<E> b = sentinel.next;
        Node<E> added = new Node<>(e, a, b);
        a.next = added;
        b.prev = added;
        size ++;
        return true;
    }

    @Override
    public boolean offerLast(E e) {
        if(isFull())
            return false;
        Node<E> a = sentinel;
        Node<E> b = sentinel.prev;
        Node<E> added = new Node<>(e, b, a);
        a.prev = added;
        b.next = added;
        size ++;
        return true;
    }

    @Override
    public E pollFirst() {
        if(isEmpty())
            return null;
        Node<E> a = sentinel;
        Node<E> b = sentinel.next.next;
        Node<E> e = sentinel.next;
        a.next =  b;
        b.prev = a;
        size --;
        return e.value;
    }

    @Override
    public E pollLast() {
        if(isEmpty())
            return null;
        Node<E> a = sentinel;
        Node<E> b = sentinel.prev.prev;
        Node<E> e = sentinel.prev;
        a.prev =  b;
        b.next = a;
        size --;
        return e.value;
    }

    @Override
    public E peekFirst() {
        if(isEmpty())
            return null;
        Node<E> e = sentinel.next;
        return e.value;        }

    @Override
    public E peekLast() {
        if(isEmpty())
            return null;
        Node<E> e = sentinel.prev;
        return e.value;      }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node<E> p = sentinel.next;

            @Override
            public boolean hasNext() {
                return p != sentinel;
            }

            @Override
            public E next() {
                E e = p.value;
                p = p.next;
                return e;
            }
        };
    }


    private static class Node<E> {
        E value;
        Node<E> prev;
        Node<E> next;

        public Node(E value, Node<E> prev, Node<E> next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
}
