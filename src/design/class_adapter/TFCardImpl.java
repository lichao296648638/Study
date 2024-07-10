package design.class_adapter;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/13 3:19
 */
public class TFCardImpl implements TFCard{
    @Override
    public String readTF() {
        return "readTF";
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("writeTF" + msg);
    }


}
