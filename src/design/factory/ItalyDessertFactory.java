package design.factory;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/5 2:46
 */
public class ItalyDessertFactory implements DessertFactory {

    @Override
    public Coffee coffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert dessert() {
        return new Trimis();
    }
}
