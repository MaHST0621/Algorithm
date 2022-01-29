package Executers;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * ExecutorService pool = Executors.newFixedThreadPool(int count);
 *  * new ThreadPoolExecutor(
 *  *                    count,
 *  *                    count,
 *  *                    0L,
 *  *                    TIME,
 *  *                    new ArrayBlockingQueue<>()
 *  *                    )
 * 创建一个包含 count 线程的线程池
 * 如果线程池可用线程繁忙时，异步任务都在阻塞队列等待,容易OOM
 * 弊端： 阻塞队列长度是无限的，容易耗尽系统资源
 * 适用场景： 因为线程池能够稳定的提供线程来执行任务，因此适合CPU密集型任务场景处理（任务长时间执行），避免线程的回收和分配
 */
public class ExecutersCreateDemo2 {
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
            ExecutorService pool = Executors.newFixedThreadPool(2);

            for (int i = 0; i < 4; i++) {
                pool.execute(new ExecutersDemo());
                pool.submit(new ExecutersDemo());
            }

            pool.shutdown();
        }
    }
}
