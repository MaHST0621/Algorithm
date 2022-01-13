package Executers;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * ScheduledExecutorService scheduler = new ScheduledThreadPoolExecutor(2);
 * todo 不太懂
 */
public class ExecutersCreateDemo4 {
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

        public static void main(String[] args) throws InterruptedException {
            ScheduledExecutorService scheduler = new ScheduledThreadPoolExecutor(2);

            for (int i = 0; i < 4; i++) {
                scheduler.scheduleAtFixedRate(new ExecutersDemo(),0,500, TimeUnit.MILLISECONDS);
            }
            Thread.sleep(2000);
            scheduler.shutdown();
        }
    }
}
