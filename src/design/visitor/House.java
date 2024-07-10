package design.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/26 3:32
 */
public class House {
    List<Animal> list = new ArrayList<>();

    public void action(Person person) {
        for (Animal animal :
                list) {
            animal.accept(person);
        }
    }
}
