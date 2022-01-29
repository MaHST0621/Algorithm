package Executers;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Executors.newSingleThreadExecutor()
 *  * new AnotherClass( new ThreadPoolExecutor(
 *  *                    1,
 *  *                    1,
 *  *                    0L,
 *  *                    TIME,
 *  *                    new SynchronousQueue<>()
 *  *                    )
 *  *   )
 * 创建一个只包含一个线程的线程池
 * 所有的异步任务都是顺序执行的
 * 该方法时Executors.newFixedThreadExecutor(1),并用某一类来进行包装，防止coreThreadCount被更改
 * 弊端： 阻塞队列长度是无限的，容易耗尽系统资源
 */
public class ExecutersCreateDemo {
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
            ExecutorService pool = Executors.newSingleThreadExecutor();

            for (int i = 0; i < 4; i++) {
                pool.execute(new ExecutersDemo());
                pool.submit(new ExecutersDemo());
            }

            pool.shutdown();
        }
    }
}
