package 算法.二分查找;

/**
 * Description: 二分查找基础版本
 *
 * @author Ashes
 * @date 2023/12/31 2:13
 */
public class main {
    int i = 0;

    public static void main(String[] args) {
    }

    //时间复杂度是贼他log(n) - 紧界，省去了比较不平衡问题，但答案恰好在中间时，会比基础版本偏慢，但是不太影响。
    public static int binarySearchBasic(int[] a, int target) {
        int i = 0;
        int j = a.length - 1;
        while (i <= j) {
            int m = (i + j) >>> 1;
            if (a[m] >= target) {
                j = m - 1;
            } else {
                i = m + 1;
            }
        }
        return i;
    }
}
