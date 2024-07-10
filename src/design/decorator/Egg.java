package design.decorator;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/13 4:02
 */
public class Egg extends Garnish {
    public Egg(FastFood fastFood) {
        super(1, "鸡蛋", fastFood);
    }

    @Override
    public float cost() {
        setDes(getDes() + fastFood.getDes());
        setPrice(getPrice() + fastFood.getPrice());
        return getPrice();
    }
}
