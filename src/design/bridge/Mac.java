package design.bridge;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/17 2:47
 */
public class Mac extends OperateSystem{
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    protected void play(String name) {
        videoFile.decode();
        System.out.println(name);
    }
}
