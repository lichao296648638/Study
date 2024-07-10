package 算法.堆;

import java.util.Arrays;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/6/19 13:49
 */
public class MinHeap {

    int[] array;
    int size;

    public MinHeap(int capacity) {
        array = new int[capacity];
    }

    public int peek() {
        if (size != 0)
            return array[0];
        else
            return -1;
    }

    public boolean isFull() {
        return size == array.length;
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
            if (offered < array[parent]) {
                array[child] = array[parent];
            } else {
                break;
            }
            child = parent;

        }
        array[child] = offered;
    }

    public MinHeap(int[] data) {
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
        int min = parent;
        if (left < size && array[left] < array[min]) {
            min = left;
        }

        if (right < size && array[right] < array[min]) {
            min = right;
        }

        if (min != parent) {
            swap(min, parent);
            down(min);
        }

    }

    public void swap(int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

}
