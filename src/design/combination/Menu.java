package design.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/17 3:22
 */
public class Menu extends MenuComponent{

    public List<MenuComponent> menuComponents = new ArrayList<>();

    Menu(String name, int level) {
        super(name, level);
    }

    @Override
    void add(MenuComponent menuComponent) {

        menuComponents.add(menuComponent);
    }

    @Override
    void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    void getChild(int index) {
        menuComponents.get(index);
    }

    @Override
    void print() {

        System.out.println(name);
        for (MenuComponent menuComponent : menuComponents) {
            System.out.print("--");
            menuComponent.print();
        }
    }
}
