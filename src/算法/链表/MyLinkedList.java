package 算法.链表;


import java.util.Iterator;
import java.util.function.Consumer;

/**
 * 手撸一个单向链表
 *
 * @author 李超
 */
public class MyLinkedList implements Iterable<Integer> {

    /**
     * 哨兵节点，用来简化边界条件
     * <b>
     * 如：在链表进行尾插时，若没有哨兵节点，则先需要判断头节点是否为空才能判断是否可以调用node.next
     * <b/>
     */
    Node head = new Node(0, null);

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node p = head.next;

            @Override
            public boolean hasNext() {
                return p != null;
            }

            @Override
            public Integer next() {
                int v = p.value;
                p = p.next;
                return v;
            }
        };
    }

    private static class Node {
        int value;
        Node next;

        private Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    /**
     * 头插法
     *
     * @param value 要在链表头部插入的值
     */
    public void addFirst(int value) {
        head.next = new Node(value, head.next);
    }

    /**
     * 使用while循环遍历链表
     */

    public void loop1(Consumer<Integer> consumer) {
        Node p = head.next;
        while (p != null) {
            consumer.accept(p.value);
            p = p.next;
        }
    }

    /**
     * 使用for循环遍历链表
     */

    public void loop2(Consumer<Integer> consumer) {
        for (Node p = head.next; p != null; p = p.next)
            consumer.accept(p.value);
    }

    /**
     * 找到最后的节点并返回
     */
    public Node findLast() {
        Node p;
        for (p = head; p.next != null; p = p.next) {

        }
        return p;
    }

    public void addLast(int value) {
        Node p = findLast();
        p.next = new Node(value, null);
    }

    public Node findNode(int index) {
        Node p;
        int i = 0;
        for (p = head; p != null; p = p.next, i++) {
            if (i == index) {
                return p;
            }
        }

        if (p == null) {
            illegal(index);
        }
        return null;
    }

    public int get(int index) {
        Node n = findNode(index);
        return n.value;
    }

    public void insert(int index, int value) {
        Node node = findNode(index);
        node.next = new Node(value, node.next);
    }

    public void removeFirst() {
        if (head.next == null) {
            illegal(0);
        }
        head.next = head.next.next;
    }

    public void remove(int index) {

        Node prev = findNode(index);
        Node node = prev.next;
        if (node == null || node.next == null)
            illegal(index);
        prev.next = node.next;
    }

    private  void illegal(int i) {
        try {
            throw new IllegalArgumentException(String.format("下标%d不合法", i));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

}
