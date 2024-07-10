package 算法.队列;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/5/22 6:36
 */
public class test {
    @Test
    @DisplayName("测试构建")
    void init() {
        ArrayQueue<Integer> queue = new ArrayQueue<>(4);
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        queue.offer(4);
        Assertions.assertIterableEquals(List.of(1, 2, 3, 4), queue);
    }

    @Test
    @DisplayName("测试取队头")
    void testPeek() {
        ArrayQueue<Integer> queue = new ArrayQueue<>(3);
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        Assertions.assertEquals(queue.peek(), 1);
    }

    @Test
    @DisplayName("测试移除队头")
    void testPoll() {
        ArrayQueue<Integer> queue = new ArrayQueue<>(3);
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        Assertions.assertEquals(queue.poll(), 1);
        Assertions.assertEquals(queue.poll(), 2);
        Assertions.assertEquals(queue.poll(), 3);
        Assertions.assertEquals(queue.poll(), 4);
    }

    @Test
    @DisplayName("满队列")
    void testIsFull() {
        ArrayQueue<Integer> queue = new ArrayQueue<>(3);
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        assertTrue(queue.offer(4));

        Assertions.assertIterableEquals(List.of(1, 2, 3, 4), queue);
    }

    @DisplayName("双端队列")
    @Test
    public void poll() {
        LinkedListDequeue<Integer> deque = new LinkedListDequeue<>(5);
        deque.offerLast(1);
        deque.offerLast(2);
        deque.offerLast(3);
        deque.offerLast(4);
        deque.offerLast(5);

        assertEquals(1, deque.pollFirst());
        assertEquals(2, deque.pollFirst());
        assertEquals(5, deque.pollLast());
        assertEquals(4, deque.pollLast());
        assertEquals(3, deque.pollLast());
        assertNull(deque.pollLast());
        assertTrue(deque.isEmpty());
    }

    @Test
    @DisplayName("双端队列")
    public void offer() {
        LinkedListDequeue<Integer> deque = new LinkedListDequeue<>(5);
        deque.offerFirst(1);
        deque.offerFirst(2);
        deque.offerFirst(3);
        deque.offerLast(4);
        deque.offerLast(5);
        assertFalse(deque.offerLast(6));
        assertIterableEquals(List.of(3, 2, 1, 4, 5), deque);
    }


    @Test
    @DisplayName("数组双端队列插入")
    public void offerArray() {
        ArrayDeQue<Integer> deque = new ArrayDeQue<>(3);
        deque.offerFirst(1);
        deque.offerFirst(2);
        deque.offerLast(3);
        assertFalse(deque.offerLast(4));
        assertIterableEquals(List.of(2, 1, 3), deque);
    }

    @Test
    @DisplayName("数组双端队列读取")
    public void pollArray() {
        ArrayDeQue<Integer> deque = new ArrayDeQue<>(7);
        assertTrue(deque.isEmpty());
        deque.offerLast(1);
        deque.offerLast(2);
        deque.offerLast(3);
        deque.offerFirst(4);
        deque.offerFirst(5);
        deque.offerFirst(6);
        deque.offerFirst(7);
        assertIterableEquals(List.of(7, 6, 5, 4, 1, 2, 3), deque);
        assertTrue(deque.isFull());
        //54123
        assertEquals(7, deque.pollFirst());
        assertEquals(6, deque.pollFirst());
        assertEquals(3, deque.pollLast());
        assertEquals(2, deque.pollLast());
        assertEquals(1, deque.pollLast());
        assertEquals(4, deque.pollLast());
        assertEquals(5, deque.pollLast());
        assertNull(deque.pollLast());
        assertTrue(deque.isEmpty());
    }

    @Test
    @DisplayName("优先级队列取数据")
    public void priorityPoll() {
        PriorityQueue3<Entry> queue = new PriorityQueue3<>(5);
        queue.offer(new Entry("task1", 4));
        queue.offer(new Entry("task2", 3));
        queue.offer(new Entry("task3", 2));
        queue.offer(new Entry("task4", 5));
        queue.offer(new Entry("task5", 1));
        assertFalse(queue.offer(new Entry("task6", 7)));
        assertEquals(5, queue.peek().priority);
        assertEquals(5, queue.poll().priority());
        assertEquals(4, queue.poll().priority());
        assertEquals(3, queue.poll().priority());
        assertEquals(2, queue.poll().priority());
        assertEquals(1, queue.poll().priority());
        System.out.println(1 / 2);
    }
}