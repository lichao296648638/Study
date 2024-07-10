package design.decorator;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/13 3:53
 */
public class FriedNoddle extends FastFood{
    @Override
    public float cost() {
        setDes("炒面");
        setPrice(11);
        return getPrice();
    }
}
