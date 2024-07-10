package design.factory;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/5 2:36
 */
public class main {
    public static void main(String[] args) {
        CoffeeFactory factory = new CoffeeFactory();
        Coffee coffee = factory.createCoffee("american");
        System.out.println(coffee.getName());
    }
}
