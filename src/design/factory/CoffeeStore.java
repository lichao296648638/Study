package design.factory;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/5 2:33
 */
public class CoffeeStore {
    DessertFactory dessertFactory;

    public void setDessertFactory(DessertFactory coffeeFactory) {
        this.dessertFactory = coffeeFactory;
    }

    public Coffee orderCoffee() {
        return dessertFactory.coffee();
    }

    public Dessert orderDessert() {
        return dessertFactory.dessert();
    }

}
