package 算法.队列;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;


/**
 * Description:
 *
 * @author Ashes
 * @date 2024/6/13 7:37
 */
public class BlockingQueue1<E> implements BlockingQueue<E>{
    private int size;
    private int head;
    private int tail;
    private final E[] array;
    private ReentrantLock lock = new ReentrantLock();
    private Condition headWait = lock.newCondition();
    private Condition tailWait = lock.newCondition();

    public BlockingQueue1(int capacity) {
        array = (E[]) new Object[capacity];
    }

    @Override
    public void offer(E e) throws InterruptedException {
        lock.lockInterruptibly();
        try {
            while (isFull()) {
                tailWait.await();
            }
            array[tail] = e;
            if (++tail == array.length) {
                tail = 0;
            }
            size ++;
            headWait.signal();
        }finally {
            lock.unlock();
        }

    }

    @Override
    public boolean offer(E e, long time) throws InterruptedException {
        lock.lockInterruptibly();
        long t = TimeUnit.MILLISECONDS.toNanos(time);
        try {
            while (isFull()) {
                if (t <= 0) {
                    return false;
                }
             t = tailWait.awaitNanos(t);
            }
            array[tail] = e;
            if (++tail == array.length) {
                tail = 0;
            }
            size ++;
            headWait.signal();
            return true;
        }finally {
            lock.unlock();
        }
    }

    @Override
    public E poll() throws InterruptedException {
        lock.lockInterruptibly();
        try {
            while (isEmpty()) {
                headWait.await();
            }
            E e =  array[head];
            array[head] = null;

            if (++head == array.length) {
                head = 0;
            }
            size --;
            return e;
        }finally {
            lock.unlock();
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        return "BlockingQueue1{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    @Override
    public boolean isFull() {
        return size == array.length;
    }
}
