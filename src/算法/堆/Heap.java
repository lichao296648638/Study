package 算法.堆;

import java.util.Arrays;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/6/20 14:26
 */
public class Heap {

    private int[] array;
    private int size;
    private boolean max;

    public Heap(int capacity, boolean max) {
        array = new int[capacity];
        this.max = max;
    }

    public int peek() {
        if (size != 0)
            return array[0];
        else
            return -1;
    }

    public int poll() {
        if (size == 0) return -1;
        int polled = array[0];
        swap(0, size - 1);
        size--;
        down(0);
        return polled;
    }

    private void grow() {
        int capacity = size + (size >> 1);
        int[] newArray = new int[capacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    public boolean offer(int offered) {
        if (size == array.length)
            grow();
        array[size] = offered;
        up(size);
        size++;
        return true;
    }

    private void up(int index) {
        int offered = array[index];
        while (index > 0) {
            int parent = (index - 1) / 2;
            boolean cmp = max ? offered > array[parent] : offered < array[parent];
            if (cmp) {
                array[index] = array[parent];
                index = parent;
            } else {
                break;
            }
        }
        array[index] = offered;
    }

    public Heap(int[] data) {
        this.size = data.length;
        array = data;
        buildHeap();
    }

    private void buildHeap() {
        for (int i = size / 2 - 1; i >= 0; i--) {
            down(i);
        }
    }

    private void down(int parent) {
        int left = parent * 2 + 1;
        int right = left + 1;
        int swap = parent;

        if (left < size && (max ? array[left] > array[swap] : array[left] < array[swap])) {
            swap = left;
        }

        if (right < size && (max ? array[right] > array[swap] : array[right] < array[swap])) {
            swap = right;
        }

        if (swap != parent) {
            swap(swap, parent);
            down(swap);
        }
    }

    private void swap(int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    public static void main(String[] args) {
        Heap heap = new Heap(10, true);
        for (int i = 0; i < 6; i++) {
            heap.offer(i);
        }
        System.out.println(Arrays.toString(heap.array));
    }
}
