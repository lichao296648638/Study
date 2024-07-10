package 算法.栈;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;


/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/8 23:14
 */
public class TestTest {

    @Test
    @DisplayName("测试入栈")
     void test1() {
        ArrayStack<Integer> stack = new ArrayStack<>(3);
        Assertions.assertTrue(stack.push(1));
        Assertions.assertTrue(stack.push(2));
        Assertions.assertTrue(stack.push(3));
        Assertions.assertIterableEquals(List.of(3,2,1), stack);
    }

    @Test
    @DisplayName("测试出栈")
    void test2() {
        ArrayStack<Integer> stack = new ArrayStack<>(3);
        Assertions.assertTrue(stack.push(1));
        Assertions.assertTrue(stack.push(2));
        Assertions.assertTrue(stack.push(3));
        Assertions.assertEquals(3, stack.pop());
        Assertions.assertEquals(2, stack.pop());
        Assertions.assertEquals(1, stack.pop());
        Assertions.assertNull(stack.pop());
    }


    }
