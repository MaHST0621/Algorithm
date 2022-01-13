package Executers;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Executors.newCachedThreadPool();
 * 只要有异步任务提交进来就会创建一个线程来执行，可以创建无限个线程
 * 弊端： 因为可以创建无数个线程，所以容易耗尽系统资源
 * 使用场景： 用来 快速处理突发性的高异步任务提交场景，短时间处理异步任务
 */
public class ExecutersCreateDemo3 {
    private static  int MAX_TURN = 5;
    private static int SLEEP_TIME = 2000;
    private static AtomicInteger atom = new AtomicInteger(1);
    static class ExecutersDemo implements Runnable {
        private String threadName;
        public ExecutersDemo() {
            threadName = "thread-" + atom.get();
            atom.incrementAndGet();
        }
        @Override
        public void run() {
            System.out.println(threadName + " 正在执行");
            for (int i = 0; i < MAX_TURN; i++) {
                System.out.println(threadName + " 轮询" + i);
                try {
                    Thread.sleep(SLEEP_TIME);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(threadName + " 执行完毕");
        }

        public static void main(String[] args) {
            ExecutorService pool = Executors.newCachedThreadPool();

            for (int i = 0; i < 4; i++) {
                pool.execute(new ExecutersDemo());
                pool.submit(new ExecutersDemo());
            }

            pool.shutdown();
        }
    }
}
