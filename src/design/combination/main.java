package design.combination;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/17 3:24
 */
public class main {
    public static void main(String[] args) {
        MenuComponent menuComponent1 = new Menu("系统菜单", 1);
        Menu menu1 = new Menu("系统1", 2);
        Menu menu2 = new Menu("系统2", 2);
        Menu menu3 = new Menu("系统3", 2);
        MenuItem menuItem1 = new MenuItem("文件1", 3);
        MenuItem menuItem2 = new MenuItem("文件2", 3);
        MenuItem menuItem3 = new MenuItem("文件3", 3);

        menu1.add(menuItem1);
        menu1.add(menuItem2);
        menu1.add(menuItem3);
        menuComponent1.add(menu1);
        menuComponent1.add(menu2);
        menuComponent1.add(menu3);
        menuComponent1.print();
    }
}
