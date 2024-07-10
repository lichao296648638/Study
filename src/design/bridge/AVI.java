package design.bridge;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/17 2:45
 */
public class AVI implements VideoFile{
    @Override
    public void decode() {
        System.out.println("AVI格式：");
    }
}
