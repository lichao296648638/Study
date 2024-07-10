package 算法.二分查找;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/5 1:17
 */
public class erfen {

    public int left(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int temp = -1;
        while (i <= j) {
            int m = (i + j) >>> 1;
            if (target < nums[m]) {
                j = m - 1;
            } else if (target > nums[m]) {
                i = m + 1;
            } else {
                temp = m;
                j = m - 1;
            }
        }
        return temp;
    }

    public int right(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int temp = -1;
        while (i <= j) {
            int m = (i + j) >>> 1;
            if (target < nums[m]) {
                j = m - 1;
            } else if (target > nums[m]) {
                i = m + 1;
            } else {
                temp = m;
                i = m + 1;
            }
        }
        return temp;
    }

}
