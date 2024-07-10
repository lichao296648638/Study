package 算法.链表;

import org.junit.jupiter.api.*;

import java.util.Arrays;


/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/8 23:14
 */
public class TestTest {

    @Test
    @DisplayName("测试头插")
     void test1() {
        DoublyLinkedListSentinel doublyLinkedListSentinel = new DoublyLinkedListSentinel();
        doublyLinkedListSentinel.addFirst(1);
        doublyLinkedListSentinel.addFirst(2);
        doublyLinkedListSentinel.addFirst(3);
        doublyLinkedListSentinel.addFirst(4);
        doublyLinkedListSentinel.addFirst(5);
        Assertions.assertIterableEquals(Arrays.asList(5,4,3,2,1), doublyLinkedListSentinel);

    }

    @Test
    @DisplayName("测试尾插")
    void test2() {
        DoublyLinkedListSentinel doublyLinkedListSentinel = new DoublyLinkedListSentinel();
        doublyLinkedListSentinel.addLast(1);
        doublyLinkedListSentinel.addLast(2);
        doublyLinkedListSentinel.addLast(3);
        doublyLinkedListSentinel.addLast(4);
        doublyLinkedListSentinel.addLast(5);
        Assertions.assertIterableEquals(Arrays.asList(1,2,3,4,5), doublyLinkedListSentinel);

    }

    @Test
    @DisplayName("测试删头")
    void test3() {
        DoublyLinkedListSentinel doublyLinkedListSentinel = new DoublyLinkedListSentinel();
        doublyLinkedListSentinel.addLast(1);
        doublyLinkedListSentinel.addLast(2);
        doublyLinkedListSentinel.addLast(3);
        doublyLinkedListSentinel.addLast(4);
        doublyLinkedListSentinel.addLast(5);
        doublyLinkedListSentinel.removeFirst();
        doublyLinkedListSentinel.removeFirst();
        doublyLinkedListSentinel.removeFirst();
        doublyLinkedListSentinel.removeFirst();
        doublyLinkedListSentinel.removeFirst();
        doublyLinkedListSentinel.removeFirst();
        Assertions.assertIterableEquals(Arrays.asList(), doublyLinkedListSentinel);
    }

    @Test
    @DisplayName("测试删尾")
    void test4() {
        DoublyLinkedListSentinel doublyLinkedListSentinel = new DoublyLinkedListSentinel();
        doublyLinkedListSentinel.addLast(1);
        doublyLinkedListSentinel.addLast(2);
        doublyLinkedListSentinel.addLast(3);
        doublyLinkedListSentinel.addLast(4);
        doublyLinkedListSentinel.addLast(5);
        doublyLinkedListSentinel.removeLast();
        doublyLinkedListSentinel.removeLast();
        doublyLinkedListSentinel.removeLast();
        doublyLinkedListSentinel.removeLast();
        doublyLinkedListSentinel.removeLast();
        doublyLinkedListSentinel.removeLast();
        Assertions.assertIterableEquals(Arrays.asList(), doublyLinkedListSentinel);
    }

    @Test
    @DisplayName("测试按照值删")
    void test5() {
        DoublyLinkedListSentinel doublyLinkedListSentinel = new DoublyLinkedListSentinel();
        doublyLinkedListSentinel.addLast(1);
        doublyLinkedListSentinel.addLast(2);
        doublyLinkedListSentinel.addLast(3);
        doublyLinkedListSentinel.addLast(4);
        doublyLinkedListSentinel.addLast(5);
        doublyLinkedListSentinel.removeByValue(3);
        doublyLinkedListSentinel.removeByValue(4);
        doublyLinkedListSentinel.removeByValue(1);
        doublyLinkedListSentinel.removeByValue(2);
        doublyLinkedListSentinel.removeByValue(5);
        doublyLinkedListSentinel.removeByValue(5);
        Assertions.assertIterableEquals(Arrays.asList(), doublyLinkedListSentinel);
    }


    @Test
    @DisplayName("递归遍历")
    void test6() {
        DoublyLinkedListSentinel doublyLinkedListSentinel = new DoublyLinkedListSentinel();
        doublyLinkedListSentinel.addLast(1);
        doublyLinkedListSentinel.addLast(2);
        doublyLinkedListSentinel.addLast(3);
        doublyLinkedListSentinel.addLast(4);
        doublyLinkedListSentinel.addLast(5);
        doublyLinkedListSentinel.recursion(doublyLinkedListSentinel.findNode(1),value->{
            System.out.println(value);
        }, value->{
            System.out.println(value);
        });
        Assertions.assertIterableEquals(Arrays.asList(1,2,3,4,5), doublyLinkedListSentinel);
    }

    @Test
    @DisplayName("合并链表")
    void test7() {
        DoublyLinkedListSentinel doublyLinkedListSentinel = new DoublyLinkedListSentinel();
        doublyLinkedListSentinel.addLast(1);
        doublyLinkedListSentinel.addLast(2);
        doublyLinkedListSentinel.addLast(3);
        doublyLinkedListSentinel.addLast(4);
        doublyLinkedListSentinel.addLast(5);
        doublyLinkedListSentinel.recursion(doublyLinkedListSentinel.findNode(1),value->{
            System.out.println(value);
        }, value->{
            System.out.println(value);
        });
        Assertions.assertIterableEquals(Arrays.asList(1,2,3,4,5), doublyLinkedListSentinel);
    }
}
