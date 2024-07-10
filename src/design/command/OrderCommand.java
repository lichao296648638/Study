package design.command;

import java.util.Map;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/19 21:01
 */
public class OrderCommand implements Command{
    Chef chef;
    Order order;

    public OrderCommand(Chef chef, Order order) {
        this.chef = chef;
        this.order = order;
    }

    @Override
    public void execute() {
        Map<String, Integer> map = order.getFood();
        System.out.println(order.getID()+"号桌订单开始!");
        for (String food : map.keySet()) {
            chef.cook(food, map.get(food));
        }
        System.out.println(order.getID()+"号桌订单做完了!");

    }
}
