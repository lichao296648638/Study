package 算法.栈;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/5/24 7:45
 */
public interface Stack<E> {
    boolean push(E e);
    E pop();
    E peek();
    boolean isEmpty();
    boolean isFull();
}
