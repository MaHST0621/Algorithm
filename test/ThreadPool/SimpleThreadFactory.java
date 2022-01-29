package ThreadPool;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description:
 * @author：异想天开的咸鱼
 * @date: 2022/1/29
 */
public class SimpleThreadFactory {
    private static AtomicInteger threadId = new AtomicInteger(1);
    private static String threadName = "simpleThread-";

    static class ThreadFactoryDemo  implements ThreadFactory {
        @Override
        public Thread newThread(Runnable r) {
            String Name = threadName + threadId.get();
            threadId.incrementAndGet();
            System.out.println("创建线程： " + Name + " 成功");
            Thread thread = new Thread(r,Name);
            return thread;
        }
    }
}
