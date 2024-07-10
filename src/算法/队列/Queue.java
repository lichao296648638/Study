package 算法.队列;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/5/18 1:25
 */
public interface Queue<E> {

    boolean offer(E e);

    boolean isEmpty();

    E peek();

    E poll();

    boolean isFull();
}
