package 算法.队列;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/5/31 19:55
 */
public interface Deque<E> {

    boolean isEmpty();
    boolean isFull();
    boolean offerFirst(E e);
    boolean offerLast(E e);
    E pollFirst();
    E pollLast();
    E peekFirst();
    E peekLast();
}
