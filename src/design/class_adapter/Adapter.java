package design.class_adapter;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/13 3:23
 */
public class Adapter implements SDCard{
    TFCardImpl tfCard;

    Adapter(TFCardImpl tfCard) {
        this.tfCard = tfCard;
    }
    @Override
    public String readSD() {
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        tfCard.writeTF(msg);
    }
}
