package design.combination;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/17 3:24
 */
public class MenuItem extends MenuComponent{

    MenuItem(String name, int level) {
        super(name, level);
    }

    @Override
    void print() {
        System.out.print("--");
        System.out.println(name);
    }
}
