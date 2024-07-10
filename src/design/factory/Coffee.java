package design.factory;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/5 2:32
 */
public abstract class Coffee {
    public abstract String getName();

    public void addSugar() {
        System.out.println("加糖");
    }

    public void addMilk() {
        System.out.println("加奶");
    }
}
