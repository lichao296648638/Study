package 算法.二分查找;




import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.Arrays;

/**
 * Description: 测试用例
 *
 * @author Ashes
 * @date 2023/12/31 2:16
 */
public class TestBinarySearch {

    @Test
    @DisplayName("找到了")
    public  void test1() {
        int[] a = {23, 45, 45, 45, 65, 87, 211, 234, 54, 12, 234};
        Arrays.sort(a);
        assertEquals(0, main.binarySearchBasic(a, 12));
        assertEquals(1, main.binarySearchBasic(a, 23));
        assertEquals(2, main.binarySearchBasic(a, 45));

    }

    @Test
    @DisplayName("没找到")
    public  void test2() {
        int[] a = {23, 45, 65, 87, 211, 234, 54, 12, 234};
        Arrays.sort(a);
        assertEquals(-1, main.binarySearchBasic(a, 2323));
    }
}
