package design.mediator;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/26 2:54
 */
public abstract class Mediator {
    String name;
    Person person;

    abstract void contact(String message, Person person);
}
