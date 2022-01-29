package ThreadPool;

import java.util.concurrent.*;

/**
 * @description:
 * @author：异想天开的咸鱼
 * @date: 2022/1/29
 */
public class ThreadPoolShutDown {
    public static void main(String[] args) throws InterruptedException {
        int core = 2;
        int max = 4;
        BlockingQueue queue = new ArrayBlockingQueue(50);
        ThreadFactory factory = new SimpleThreadFactory.ThreadFactoryDemo();
        ThreadPoolReject.SimpleRejectDemo police = new ThreadPoolReject.SimpleRejectDemo();
        int keep = 100;
        ThreadPoolExecutor pool = new ThreadPoolExecutor(core,max,keep, TimeUnit.SECONDS,queue,factory,police);
        pool.prestartAllCoreThreads();

        for (int i = 0;i < 10; i++) {
            pool.execute(new RunnableTask.RunnableDemo());
        }

        pool.shutdownNow();
        for (int i = 0;i < 10; i++) {
            pool.execute(new RunnableTask.RunnableDemo());
        }
        while(pool.awaitTermination(4,TimeUnit.SECONDS) && !pool.isTerminated()) {
            System.out.println("线程未执行完毕");
        }
    }
}
