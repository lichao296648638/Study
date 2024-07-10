package 算法.队列;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/6/13 7:34
 */
public interface BlockingQueue<E> {

    void offer(E e) throws InterruptedException;

    boolean offer(E e, long time) throws InterruptedException;

    E poll() throws InterruptedException;

    boolean isEmpty();

    boolean isFull();
}
