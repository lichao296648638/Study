package design.observer;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/23 1:44
 */
public class main {
    public static void main(String[] args) {
        Observer observer1 = new WXObserver("老张");
        Observer observer2 = new WXObserver("王");
        Observer observer3 = new WXObserver("芳芳");
        Subject mySubject = new MySubject();
        mySubject.attach(observer1);
        mySubject.attach(observer2);
        mySubject.attach(observer3);
        mySubject.update("更新拉");
    }
}
