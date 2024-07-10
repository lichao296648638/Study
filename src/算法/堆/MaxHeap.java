package 算法.堆;

import java.util.Arrays;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/6/18 9:33
 */
public class MaxHeap {
    int[] array;
    int size;

    public MaxHeap(int capacity) {
        array = new int[capacity];
    }

    public int peek() {
        if (size != 0)
            return array[0];
        else
            return -1;
    }

    public int poll() {
        int polled = array[0];
        swap(0, size - 1);
        down(0);
        size--;
        return polled;
    }

    public int poll(int index) {
        int polled = array[index];
        swap(index, size - 1);
        down(index);
        size--;
        return polled;
    }

    public void replace(int replaced) {
        array[0] = replaced;
        down(0);
    }

    public boolean offer(int offered) {
        if (size == array.length)
            return false;
        array[size] = offered;
        up(offered);
        size++;
        return true;
    }

    public void up(int offered) {
        int child = size;
        while (child > 0) {
            int parent = (child - 1) / 2;
            if (offered > array[parent]) {
                array[child] = array[parent];
            } else {
                break;
            }
            child = parent;

        }
        array[child] = offered;
    }

    public MaxHeap(int[] data) {
        this.size = data.length;
        array = data;
        buildHeap();
    }

    public void buildHeap() {
        for (int i = size / 2 - 1; i >= 0; i--) {
            down(i);
        }
    }

    public void down(int parent) {
        int left = parent * 2 + 1;
        int right = left + 1;
        int max = parent;
        if (left < size && array[left] > array[max]) {
            max = left;
        }

        if (right < size && array[right] > array[max]) {
            max = right;
        }

        if (max != parent) {
            swap(max, parent);
            down(max);
        }

    }

    public void swap(int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    public static void main(String[] args) {
        int[] data = {2, 3, 1, 4, 6, 7, 5};
        MaxHeap maxHeap = new MaxHeap(data);
        System.out.println(Arrays.toString(maxHeap.array));
        while (maxHeap.size > 1) {
            maxHeap.swap(0, maxHeap.size - 1);
            maxHeap.size --;
            maxHeap.down(0);
        }
        System.out.println(Arrays.toString(maxHeap.array));

    }
}
