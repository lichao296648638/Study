package 算法.队列;

import java.util.Iterator;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/5/22 6:58
 */
public class ArrayQueue<E> implements Queue<E>, Iterable<E> {

    E[] queue;
    int head = 0;
    int tail = 0;

    public ArrayQueue(int capacity) {
        capacity -= 1;
        capacity |= capacity >> 1;
        capacity |= capacity >> 2;
        capacity |= capacity >> 4;
        capacity |= capacity >> 6;
        capacity |= capacity >> 8;
        capacity |= capacity >> 16;
        capacity += 1;
        queue = (E[]) new Object[capacity];
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int p = head;
            @Override
            public boolean hasNext() {
                return p != tail;
            }

            @Override
            public E next() {
                E value = queue[p & (queue.length - 1)];
                p ++;
                return value;
            }
        };
    }

    @Override
    public boolean offer(E e) {
        if (isFull())
            return false;
        queue[tail & (queue.length - 1)] = e;
        tail ++;
        return true;
    }

    @Override
    public boolean isEmpty() {
        return tail == head;
    }

    @Override
    public E peek() {
        if (isEmpty())
            return null;
        return queue[head & (queue.length - 1)];
    }

    @Override
    public E poll() {
        if (isEmpty())
            return null;
        E e = queue[head & (queue.length - 1)];
        head ++;
        return e;
    }

    @Override
    public boolean isFull() {
        return tail - head == queue.length;
    }
}
