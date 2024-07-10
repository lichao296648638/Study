package 算法.队列;

/**
 * Description:
 *有序
 * @author Ashes
 * @date 2024/6/7 2:40
 */
public class PriorityQueue2<E extends Priority> implements Queue<E> {

    int size;
    Priority[] array;

    public PriorityQueue2(int capacity) {
        this.array = new Priority[capacity];
    }


    @Override
    public boolean offer(E e) {
        if (isFull())
            return false;
        insert(e);
        size++;
        return true;
    }

    void insert(E e) {
        int i = size - 1;
        while (i >= 0 && array[i].priority() > e.priority()) {
            array[i + 1] = array[i];
            i--;
        }
        array[i + 1] = e;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E peek() {
        if (isEmpty())
            return null;
        return (E) array[size - 1];
    }

    @Override
    public E poll() {
        if (isEmpty())
            return null;
        E e = (E) array[size - 1];
        array[size - 1] = null;
        size--;
        return e;
    }



    @Override
    public boolean isFull() {
        return size == array.length;
    }
}
