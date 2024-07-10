package design.observer;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/23 1:39
 */
public interface Subject {
    void attach(Observer observer);

    void update(String message);
}
