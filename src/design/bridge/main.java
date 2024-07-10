package design.bridge;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/17 2:51
 */
public class main {
    public static void main(String[] args) {
        OperateSystem mac = new Mac(new AVI());
        mac.play("战狼3");
    }
}
