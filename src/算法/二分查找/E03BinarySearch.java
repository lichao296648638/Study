package 算法.二分查找;

import java.util.Arrays;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/10 1:29
 */
public class E03BinarySearch {

    public static void main(String[] args) {
        int[] a = {4, 3, 2, 42, 6, 12, 34, 321, 65};
        System.out.println(Arrays.toString(a));
        insertion(a, 0);
        System.out.println(Arrays.toString(a));

    }

    public static int f(int[] a, int target, int i, int j) {
        if (i > j) {
            return -1;
        }

        int m = (i + j) >>> 1;
        if (target < a[m]) {
            return f(a, target, i, m - 1);
        } else if (target > a[m]) {
            return f(a, target, m + 1, j);
        } else {
            return m;
        }
    }

    public static void bubble(int[] a, int j) {
        if (j == 0) {
            return;
        }
        int x = 0;
        for (int i = 0; i < j; i++) {
            if (a[i] > a[i + 1]) {
                int t = a[i];
                a[i] = a[i + 1];
                a[i + 1] = t;
                x = i;
            }
        }
        bubble(a, x);
    }

    public static void insertion(int[] a, int low) {
        if (low == a.length) {
            return;
        }
        int t = a[low];
        int i = low - 1;
        while (i >= 0 && a[i] > t) {
            a[i + 1] = a[i];
            i--;
        }
        a[i + 1] = t;
        insertion(a, low + 1);
    }
}
