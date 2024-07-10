package design.visitor;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/26 3:29
 */
public class SomeOne implements Person {

    public void feed(Cat cat) {
        System.out.println("陌生人喂猫");
    }

    public void feed(Dog dog) {
        System.out.println("陌生人喂狗");
    }
}
