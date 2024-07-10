package design.command;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/19 21:06
 */
public class main {
    public static void main(String[] args) {
        Order o1 = new Order();
        o1.setFood("炒蛋", 2);
        o1.setFood("面条", 1);
        o1.setID(1);

        Order o2 = new Order();
        o2.setFood("烤鱼", 1);
        o2.setFood("米饭", 1);
        o2.setID(2);
        Chef chef = new Chef();
        OrderCommand orderCommand1 = new OrderCommand(chef, o1);
        OrderCommand orderCommand2 = new OrderCommand(chef, o2);
        Waiter waiter = new Waiter();
        waiter.setCommand(orderCommand1);
        waiter.setCommand(orderCommand2);
        waiter.orderUp();
    }
}
