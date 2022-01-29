package ThreadPool;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description: task for test
 * @author：异想天开的咸鱼
 * @date: 2022/1/29
 */
public class CallableTask {
    private static AtomicInteger threadId = new AtomicInteger(0);
    private static String threadName = "CallableTask-";

    static class CallableDemo implements Callable {
        public String Name = threadName + threadId.incrementAndGet();
        @Override
        public Integer call() throws Exception {
            Random random = new Random();
            System.out.println("任务执行完毕: " + this.Name);
            return random.nextInt(10);
        }
    }

}
