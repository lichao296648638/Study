package 算法.链表;

import java.util.Iterator;
import java.util.function.Consumer;

public class DoublyLinkedListSentinel implements Iterable<Integer> {


    Node sentinel = new Node(-1, null, null);
    Node tail;

    public DoublyLinkedListSentinel() {
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node p = sentinel.next;

            @Override
            public boolean hasNext() {
                return p != sentinel;
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
     * @param value 要在链表插入的值
     */
    public void addFirst(int value) {
        Node a = sentinel;
        Node b = sentinel.next;
        Node added = new Node(value, a, b);
        a.next = added;
        b.prev = added;
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
        Node a = sentinel;
        Node b = sentinel.prev;
        Node added = new Node(value, b, a);
        a.prev = added;
        b.next = added;
    }

    public void removeByValue(int value) {
        Node removed = findNode(value);
        if (removed != null) {
            Node a = removed.prev;
            Node b = removed.next;
            a.next = b;
            b.prev = a;
        } else {
            System.out.println("没找着");
        }

    }

    public Node findNode(int value) {
        Node p = sentinel.next;
        while (p != sentinel) {
            if (p.value != value) {
                p = p.next;
            } else {
                return p;
            }
        }

        return null;
    }

    public void recursion(Node curr, Consumer<Integer> before, Consumer<Integer> after) {
        if (curr == sentinel)
            return;
        before.accept(curr.value);
        recursion(curr.next, before, after);
        after.accept(curr.value);

    }

//    public int get(int index) {
//        Node n = findNode(index);
//        return n.value;
//    }

    public void insert(int index, int value) {
//        Node prev = findNode(index - 1);
//        Node inserted = new Node(value, prev, prev.next);
//        prev.next = inserted;
//        prev.next.prev = inserted;
    }

    public void removeFirst() {
        Node removed = sentinel.next;
        if (removed == sentinel) {
            System.out.println("删完了");
        }
        Node a = sentinel;
        Node b = removed.next;
        a.next = b;
        b.prev = a;

    }

    public void removeLast() {
        Node removed = sentinel.prev;
        if (removed == sentinel) {
            System.out.println("删完了");
        }
        Node a = removed.prev;
        Node b = sentinel;
        a.next = b;
        b.prev = a;

    }

    public void remove(int index) {

//        MyLinkedList.Node prev = findNode(index);
//        MyLinkedList.Node node = prev.next;
//        if (node == null || node.next == null)
//            illegal(index);
//        prev.next = node.next;
    }

}
