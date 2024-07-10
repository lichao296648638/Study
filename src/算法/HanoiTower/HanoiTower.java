package 算法.HanoiTower;

import java.util.LinkedList;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/13 5:36
 */
public class HanoiTower {
    static  LinkedList<Integer> a = new LinkedList<>();
    static LinkedList<Integer> b = new LinkedList<>();
   static LinkedList<Integer> c = new LinkedList<>();

    public static void main(String[] args) {

        for (int i = 3; i >=1 ; i--) {
            a.addLast(i);
        }

        move(3, a, b, c);
    }

    private static void move(int n, LinkedList<Integer> a, LinkedList<Integer> b, LinkedList<Integer> c) {
        if (n == 0) {
            return;
        }

        move(n - 1, a, c, b);
        c.addLast(a.removeLast());
        extracted(a, b, c);
        move(n - 1, b, a, c);
    }

    private static void extracted(LinkedList<Integer> a, LinkedList<Integer> b, LinkedList<Integer> c) {
        System.out.println("----------------");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
