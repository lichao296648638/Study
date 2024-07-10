package 算法.队列;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/6/7 3:26
 */
public class Entry implements Priority{
    String value;
    int priority;

    public Entry(String value, int priority) {
        this.value = value;
        this.priority = priority;
    }

    @Override
    public int priority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "value='" + value + '\'' +
                ", priority=" + priority +
                '}';
    }
}
