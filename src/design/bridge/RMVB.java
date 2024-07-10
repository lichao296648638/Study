package design.bridge;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/17 2:45
 */
public class RMVB implements VideoFile{
    @Override
    public void decode() {
        System.out.println("RMVB格式：");
    }
}
