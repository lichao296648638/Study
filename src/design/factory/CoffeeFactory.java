package design.factory;


import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/6 1:45
 */

public class CoffeeFactory {

    private static HashMap<String, Coffee> coffees = new HashMap<>();

    static {
        Properties p = new Properties();
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("property.properties");
        try {
            p.load(is);
            Set<Object> set = p.keySet();
            for (Object obj : set) {
                String name = p.getProperty((String) obj);
                Class clazz = Class.forName(name);
                Coffee coffee = (Coffee) clazz.newInstance();
                coffees.put((String)obj, coffee);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Coffee createCoffee(String name) {
        return coffees.get(name);
    }

}
