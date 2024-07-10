package 算法.链表;

import java.util.LinkedList;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/5/30 21:02
 */
public class MiddleToEnd {

    static void middleToEnd(String exp) {
        LinkedList<Character> stack = new LinkedList<>();
        StringBuilder sb = new StringBuilder(exp.length());
        for (int i = 0; i < exp.length(); i++) {
            Character c = exp.charAt(i);
            switch (c) {
                case '+', '-', '*', '/' -> {
                    if (stack.isEmpty()) {
                        stack.push(c);
                    } else {
                        if (priority(stack.peek()) < priority(c)) {
                            stack.push(c);
                        } else {
                            while (!stack.isEmpty() && priority(stack.peek()) >= priority(c)) {
                                sb.append(stack.pop());
                            }
                        }
                    }
                }
                default -> {
                    sb.append(c);
                }
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb.toString());
    }

    static int priority(Character character) {
        return switch (character) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            default -> throw new IllegalArgumentException();
        };
    }

    public static void main(String[] args) {
        System.out.println();
        middleToEnd("1+2*3/4");
    }
}
