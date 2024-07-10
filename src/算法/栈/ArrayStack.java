package 算法.栈;

import java.util.Iterator;
import java.util.Scanner;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/5/25 10:03
 */
public class ArrayStack<E> implements Iterable<E> {

    int capacity;
    int top;
    E[] stack;

    public ArrayStack(int capacity) {
        stack = (E[])new Object[capacity];
    }

    public boolean push(E e) {
        if(isFull())
        return false;
        stack[top++] = e;
        return true;
    }

    public E pop() {
        if (isEmpty())
            return null;
        return stack[--top];
    }

    public E peek() {
        return stack[top - 1];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public boolean isFull() {
        return top == stack.length;
    }

    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int p = top;
            @Override
            public boolean hasNext() {
                return p > 0;
            }

            @Override
            public E next() {
                return stack[--p];
            }
        };
    }
}
