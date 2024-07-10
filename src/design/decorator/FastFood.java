package design.decorator;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/13 3:51
 */
public abstract class FastFood {
    private float price;
    private String des;

    public FastFood() {
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public FastFood(float price, String des) {
        this.price = price;
        this.des = des;
    }

    public abstract float cost();
}
