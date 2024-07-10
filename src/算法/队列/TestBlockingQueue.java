package 算法.队列;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/6/13 9:12
 */
public class TestBlockingQueue {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue2<String> queue = new BlockingQueue2<>(3);

        new Thread(() -> {
            try {
                queue.offer("任务1");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("生产1" + queue.toString());
        }).start();

        new Thread(() -> {
            try {
                queue.offer("任务2");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("生产2" + queue.toString());
        }).start();

        new Thread(() -> {
            try {
                queue.offer("任务3");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("生产3" + queue.toString());
        }).start();

        new Thread(() -> {
            try {
                queue.poll();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("消费1" + queue.toString());
        }).start();

    }
}
