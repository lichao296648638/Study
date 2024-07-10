package design.mediator;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/26 2:55
 */
public abstract class Person {
    String name;
    Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
