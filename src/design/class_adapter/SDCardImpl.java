package design.class_adapter;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/13 3:19
 */
public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        return "readSD\n";
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("writeSD" + msg);
    }
}
