package design.proxy;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/12 1:55
 */
public class main {
    public static void main(String[] args) {
        ProxyPoint proxyPoint = new ProxyPoint();
        TrainStation trainStation = proxyPoint.getProxyObject();
        trainStation.sell();
    }
}
