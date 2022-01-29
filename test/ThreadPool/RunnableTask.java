package ThreadPool;


import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description: runnable task for test
 * @author：异想天开的咸鱼
 * @date: 2022/1/29
 */
public class RunnableTask {
    private static AtomicInteger threadId = new AtomicInteger(0);
    private static String threadName = "RunnableTask-";
    static class RunnableDemo implements Runnable {
        public String Name = threadName + threadId.incrementAndGet();
        @Override
        public void run() {
            for (int i = 0;i < 10;i++) {
                System.out.println(Name + " is Running");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("我马上就停下来");
                    return;
                }
            }
            System.out.println("任务执行完毕" + this.Name);
        }
    }
}
