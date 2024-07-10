package design.express;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/2/1 4:57
 */
public class Context {
    Map<Variable, Integer> map = new HashMap<>();

    public void add(Variable variable, int i) {
        map.put(variable, i);
    }

    public int get(Variable variable) {
        return map.get(variable);
    }
}
