package design.decorator;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/13 3:55
 */
public abstract class Garnish extends FastFood{
    FastFood fastFood;

    public Garnish(float price, String des, FastFood fastFood) {
        super(price, des);
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

}
