package ThreadPool;

import java.util.concurrent.*;

/**
 * @description: 自定义拒绝策略
 * @author：异想天开的咸鱼
 * @date: 2022/1/29
 */
public class ThreadPoolReject {
    public static class SimpleRejectDemo implements RejectedExecutionHandler{

        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            System.out.println(r + "is rejected;\n" + "-get countTask: " + executor.getTaskCount());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int core = 2;
        int max = 4;
        BlockingQueue queue = new ArrayBlockingQueue(2);
        ThreadFactory factory = new SimpleThreadFactory.ThreadFactoryDemo();
        SimpleRejectDemo police = new SimpleRejectDemo();
        int keep = 100;
        ThreadPoolExecutor pool = new ThreadPoolExecutor(core,max,keep,TimeUnit.SECONDS,queue,factory,police);
        pool.prestartAllCoreThreads();
        for (int i = 0;i < 10;i++) {
            pool.execute(new RunnableTask.RunnableDemo());
        }

        Thread.sleep(10000);
    }
}
