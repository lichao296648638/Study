package design.visitor;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/26 3:28
 */
public class Cat implements Animal{
    @Override
    public void accept(Person person) {
        System.out.println("猫被访问！");
        person.feed(this);
    }
}
