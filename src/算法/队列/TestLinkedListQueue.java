package 算法.队列;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.List;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/5/18 1:27
 */
public class TestLinkedListQueue<E> implements Queue<E>, Iterable<E> {

    Node<E> head = new Node<>(null, null);
    Node<E> tail = head;

    private int size;
    private int max = Integer.MAX_VALUE;

    public TestLinkedListQueue(int max) {
        this.max = max;
    }

    public TestLinkedListQueue() {
    }

    @Override
    public Iterator<E> iterator() {

        return new Iterator<E>() {
            Node<E> p = head.next;

            @Override
            public boolean hasNext() {
                return p != head;
            }

            @Override
            public E next() {
                E value = p.value;
                p = p.next;
                return value;
            }
        };
    }

    @Override
    public boolean offer(E e) {
        if (isFull())
            return false;
        Node<E> added = new Node<E>(e, head);
        size++;
        tail.next = added;
        tail = added;
        return true;
    }

    @Override
    public boolean isEmpty() {
        return head == tail;
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            return null;
        } else {
            return head.next.value;
        }
    }

    @Override
    public E poll() {
        if (isEmpty()) {
            return null;
        } else {
            Node<E> first = head.next;
            head.next = first.next;
            if (first.next == head) {
                tail = head;
            }
            size--;
            return first.value;
        }

    }

    @Override
    public boolean isFull() {
        return size >= max;
    }


    private static class Node<E> {
        E value;
        Node<E> next;

        Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }
    }

}


