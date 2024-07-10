package design.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/19 21:03
 */
public class Waiter {
    List<Command> list = new ArrayList<>();

    public void setCommand(Command command) {
        list.add(command);
    }

    public void orderUp() {
        System.out.println("服务员开始下单...");
        for (Command command : list) {
            command.execute();
        }
    }
}
