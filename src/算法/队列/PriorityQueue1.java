package 算法.队列;

/**
 * Description:
 *乱序
 * @author Ashes
 * @date 2024/6/7 2:40
 */
public class PriorityQueue1<E extends Priority> implements Queue<E> {

    int size;
    Priority[] array;

    public PriorityQueue1(int capacity) {
        this.array = new Priority[capacity];
    }


    @Override
    public boolean offer(E e) {
        if (isFull())
            return false;
        array[size++] = e;
        return true;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E peek() {
        if (isEmpty())
            return null;
        int index = max();

        return (E) array[index];
    }

    @Override
    public E poll() {
        if (isEmpty())
            return null;
        int index = max();
        E e = (E) array[index];
        if (index < array.length - 1) {
            System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
        } else {
            size--;
        }
        return e;
    }

    int max() {
        int max = 0;
        for (int i = 1; i < size; i++) {
            if (array[i].priority() > array[max].priority()) {
                max = i;
            }
        }
        return max;
    }

    @Override
    public boolean isFull() {
        return size == array.length;
    }
}
