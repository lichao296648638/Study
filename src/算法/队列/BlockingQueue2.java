package 算法.队列;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;


/**
 * Description:
 *
 * @author Ashes
 * @date 2024/6/13 7:37
 */
public class BlockingQueue2<E> implements BlockingQueue<E> {
    private AtomicInteger size = new AtomicInteger(0);
    private int head;
    private int tail;
    private final E[] array;
    private ReentrantLock headLock = new ReentrantLock();
    private Condition headWait = headLock.newCondition();
    private ReentrantLock tailLock = new ReentrantLock();
    private Condition tailWait = tailLock.newCondition();

    public BlockingQueue2(int capacity) {
        array = (E[]) new Object[capacity];
    }

    @Override
    public void offer(E e) throws InterruptedException {
        tailLock.lockInterruptibly();
        int c = -1;
        try {
            while (isFull()) {
                tailWait.await();
            }
            array[tail] = e;
            if (++tail == array.length) {
                tail = 0;
            }

            c = size.getAndIncrement();
            if(c + 1 < array.length){
                tailWait.signal();
            }
        } finally {
            tailLock.unlock();
        }

        if (c == 0) {
            headLock.lockInterruptibly();
            try {
                headWait.signal();
            } finally {
                headLock.unlock();
            }
        }


    }

    @Override
    public boolean offer(E e, long time) throws InterruptedException {
        return false;
    }

    @Override
    public E poll() throws InterruptedException {
        E e = null;
        int c = -1;

        headLock.lockInterruptibly();
        try {
            while (isEmpty()) {
                headWait.await();
            }
            e = array[head];
            array[head] = null;

            if (++head == array.length) {
                head = 0;
            }
            c = size.getAndDecrement();
            if (c > 1) {
                headWait.signal();
            }
        } finally {
            headLock.unlock();
        }


        if(c == array.length){
            tailLock.lockInterruptibly();
            try {
                tailWait.signal();
            } finally {
                tailLock.unlock();
            }
        }

        return e;

    }

    @Override
    public boolean isEmpty() {
        return size.get() == 0;
    }

    @Override
    public String toString() {
        return "BlockingQueue1{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    @Override
    public boolean isFull() {
        return size.get() == array.length;
    }
}
