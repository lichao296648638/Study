package design.combination;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/17 3:21
 */
public class MenuComponent {
    String name;
    int level;
    MenuComponent(String name, int level) {
        this.name = name;
        this.level= level;
    }
    void add(MenuComponent menuComponent) {

    }
    void remove(MenuComponent menuComponent) {

    }

    void print() {
        System.out.println(name);
    }

}
