package design.visitor;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/26 3:28
 */
public interface Person {
    void feed(Cat cat);
    void feed(Dog dog);
}
