package design.mediator;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/26 2:59
 */
public class HouseOwner extends Person{
    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void contact(String message) {
        mediator.contact(message, this);
    }

    public void getMessage(String message) {
        System.out.println("房主" + name + "收到了：" + message);
    }
}
