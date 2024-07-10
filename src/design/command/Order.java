package design.command;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/19 20:56
 */
public class Order {
    private int ID;
    private Map<String, Integer> foods = new HashMap<>();

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Map<String, Integer> getFood() {
        return foods;
    }

    public void setFood(String name, int num) {
        foods.put(name, num);
    }
}
