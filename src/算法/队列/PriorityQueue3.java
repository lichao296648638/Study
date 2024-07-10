package 算法.队列;

/**
 * Description:
 *大顶堆实现
 * @author Ashes
 * @date 2024/6/7 2:40
 */
public class PriorityQueue3<E extends Priority> implements Queue<E> {

    int size;
    Priority[] array;

    public PriorityQueue3(int capacity) {
        this.array = new Priority[capacity];
    }


    @Override
    public boolean offer(E e) {
        if (isFull())
            return false;
        int child = size ++;
        int parent = (child - 1) / 2;
        while (child > 0 && e.priority() > array[parent].priority()) {
            array[child] = array[parent];
            child = parent;
            parent = (child - 1) / 2;
        }
        array[child] = e;
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
        return (E) array[0];
    }

    @Override
    public E poll() {
        if (isEmpty())
            return null;
        swap(0, size - 1);
        E e = (E) array[size - 1];
        array[size - 1] = null;
        size --;
        down(0);
        return e;
    }

    private void down(int parent) {
        int max = parent;
        int left = parent * 2 + 1;
        int right = left + 1;

        if (left < size && array[left].priority() > array[max].priority()) {
            max = left;
        }

        if (right < size && array[right].priority() > array[max].priority()) {
            max = right;
        }

        if (max != parent) {
            swap(parent, max);
            down(max);
        }

    }

    private void swap(int i, int j) {
        Priority t = array[i];
        array[i] = array[j];
        array[j] = t ;
    }


    @Override
    public boolean isFull() {
        return size == array.length;
    }
}
