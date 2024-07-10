package 算法.队列;

import java.util.Iterator;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/6/5 3:11
 */
public class ArrayDeQue<E> implements Deque<E>, Iterable<E> {

    int head;
    int tail;
    E[] array;

    public ArrayDeQue(int capacity) {
        array = (E[]) new Object[capacity + 1];
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
                E e = array[p];
                p = inc(p, array.length);
                return e;
            }
        };
    }

    @Override
    public boolean isEmpty() {
        return head == tail;
    }

    @Override
    public boolean isFull() {
        if(tail > head)
            return tail - head == array.length - 1;
        else if(tail < head)
            return head - tail == 1;
        return false;
    }

    @Override
    public boolean offerFirst(E e) {
        if(isFull())
            return false;
        head = des(head, array.length);
        array[head] =  e;
        return true;
    }

    @Override
    public boolean offerLast(E e) {
        if(isFull())
            return false;
        array[tail] =  e;
        tail = inc(tail, array.length);
        return true;
    }

    @Override
    public E pollFirst() {
        if(isEmpty())
            return null;
        E e = array[head];
        array[head] = null;
        head = inc(head, array.length);
        return e;
    }

    @Override
    public E pollLast() {
        if(isEmpty())
            return null;
        tail = des(tail, array.length);
        E e = array[tail];
        array[tail] = null;
        return e;
    }

    @Override
    public E peekFirst() {
        if(isEmpty())
            return null;
        return array[head];
    }

    @Override
    public E peekLast() {
        if(isEmpty())
            return null;
        return array[tail - 1];
    }

    public int inc(int i, int length) {
        if (i + 1 >= length)
            return 0;
        else
            return ++i;
    }

    public int des(int i, int length) {
        if (i <= 0)
            return length - 1;
        else
            return --i;
    }
}
