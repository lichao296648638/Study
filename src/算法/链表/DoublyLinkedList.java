package 算法.链表;

import java.util.Iterator;
import java.util.function.Consumer;

public class DoublyLinkedList implements Iterable<Integer>{



    Node head;
    Node tail;

    public DoublyLinkedList() {
        head = new Node(111, null, null);
        tail = new Node(111, null, null);
        head.next = tail;
        tail.prev = head;
    }
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
           Node p = head.next;

            @Override
            public boolean hasNext() {
                return p != tail;
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
        Node prev;

        private Node(int value, Node prev, Node next) {
            this.value = value;
            this.next = next;
            this.prev = prev;

        }
    }

    /**
     * 头插法
     *
     * @param value 要在链表头部插入的值
     */
    public void addFirst(int value) {
         head.next = new Node(value, head, head.next);
    }

    /**
     * 使用while循环遍历链表
     */

    public void loop1(Consumer<Integer> consumer) {
//        MyLinkedList.Node p = head.next;
//        while (p != null) {
//            consumer.accept(p.value);
//            p = p.next;
//        }
    }

    /**
     * 使用for循环遍历链表
     */

    public void loop2(Consumer<Integer> consumer) {
//        for (MyLinkedList.Node p = head.next; p != null; p = p.next)
//            consumer.accept(p.value);
    }

    /**
     * 找到最后的节点并返回
     */
    public Node findLast() {
//        MyLinkedList.Node p;
//        for (p = head; p.next != null; p = p.next) {
//
//        }
        return null;
    }

    public void addLast(int value) {
//        MyLinkedList.Node p = findLast();
//        p.next = new MyLinkedList.Node(value, null);
    }

    public Node findNode(int index) {
        if (index == -1) {
            return head;
        }
        Node p;
        int i = 0;
        for (p = head.next; p != tail; p = p.next, i++) {
            if (i == index) {
                return p;
            }
        }
        return null;
    }

    public int get(int index) {
        Node n = findNode(index);
        return n.value;
    }

    public void insert(int index, int value) {
        Node prev = findNode(index - 1);
        Node inserted = new Node(value, prev, prev.next);
        prev.next = inserted;
        prev.next.prev = inserted;
    }

    public void removeFirst() {

        head.next = head.next.next;
    }

    public void remove(int index) {

//        MyLinkedList.Node prev = findNode(index);
//        MyLinkedList.Node node = prev.next;
//        if (node == null || node.next == null)
//            illegal(index);
//        prev.next = node.next;
    }

}
