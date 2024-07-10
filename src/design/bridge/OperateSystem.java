package design.bridge;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/17 2:46
 */
public abstract class OperateSystem {
    VideoFile videoFile;

    public OperateSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    protected abstract void play(String name);
}
