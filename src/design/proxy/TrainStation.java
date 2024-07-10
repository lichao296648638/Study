package design.proxy;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/12 1:51
 */
public class TrainStation implements SellTickets{
    @Override
    public void sell() {
        System.out.println("卖车票");
    }
}
