package design.mediator;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/26 2:56
 */
public class Tenant extends Person {
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void contact(String message) {
        mediator.contact(message, this);
    }

    public void getMessage(String message) {
        System.out.println("租客" + name + "收到了：" + message);
    }
}
