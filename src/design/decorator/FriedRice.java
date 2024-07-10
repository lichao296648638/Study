package design.decorator;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/13 3:53
 */
public class FriedRice extends FastFood{

    @Override
    public float cost() {
        setDes("炒饭");
        setPrice(10);
        return getPrice();
    }
}
