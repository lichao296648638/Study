package design.observer;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/23 1:41
 */
public class WXObserver implements Observer {
    String name;

    public WXObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name+"-"+message);
    }
}
