package design.decorator;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/13 4:11
 */
public class main {
    public static void main(String[] args) {
        FastFood friedRice = new FriedRice();
        friedRice.cost();
        System.out.println(friedRice.getDes() + friedRice.getPrice());
        friedRice = new Egg(friedRice);
        friedRice.cost();
        System.out.println(friedRice.getDes() + friedRice.getPrice());
        friedRice = new Egg(friedRice);
        friedRice.cost();
        System.out.println(friedRice.getDes() + friedRice.getPrice());
    }
}
