package design.factory;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/5 2:45
 */
public class AmericanDessertFactory implements DessertFactory {

    @Override
    public Coffee coffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert dessert() {
        return new MachaMosse();
    }
}
