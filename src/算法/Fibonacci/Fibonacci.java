package 算法.Fibonacci;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/12 3:44
 */
public class Fibonacci {

    public int memory(int n) {
        int[] cache = new int[n + 1];
        Arrays.fill(cache, -1);
        cache[0] = 0;
        cache[1] = 1;
        return f(n, cache);
    }
    public int f(int n, int[] cache) {
        if(cache[n] != -1)
            return cache[n];
        int x = f(n - 1, cache);
        int y = f(n - 2, cache);
        cache[n] = x + y;
        return cache[n];
    }

    @Test
    void test() {
       Assertions.assertEquals(1, memory(2));
    }
}
