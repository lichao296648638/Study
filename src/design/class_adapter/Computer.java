package design.class_adapter;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/13 3:21
 */
public class Computer {
    static void readSD(SDCard sdCard) {
        System.out.println(sdCard.readSD());
        sdCard.writeSD("写数据了哦");
    }

    public static void main(String[] args) {
        readSD(new Adapter(new TFCardImpl()));
    }
}
