package Thread_Create;

import java.util.concurrent.*;

/**
 * 利用线程池创建线程
 * 重点 ： submit 和 execute 之间的区别
 */
public class CreateThread4 {
    private static int MAXTURN = 5;
    private static int ID = 1;
    static class DemoThread1 extends Thread {
        public DemoThread1() {
            super("DemoThread-" + ID++);
        }

        @Override
        public void run() {
            for (int i = 0; i < MAXTURN; i++) {
                System.out.println(this.getName() + " 轮询 ：" + i);
                try {
                    sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(this.getName() + " 执行完毕");
        }
    }

    static class DemoThread2 implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < MAXTURN;i++) {
                System.out.println(Thread.currentThread().getName() + " 轮询 :" + i);
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " 执行完毕");
        }
    }
    private static ExecutorService pool = Executors.newFixedThreadPool(3);
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        pool.execute(new DemoThread1());
        pool.submit(new DemoThread2());
        FutureTask futureTask = new FutureTask(() -> {
            long start = System.currentTimeMillis();

            int j = 1;
            for (int i = 1; i < 10000000;i++) {
                j = i * 100000000;
            }

            long end = System.currentTimeMillis();
            System.out.println(Thread.currentThread().getName() + " 执行完毕");
            return end - start;
        });
        pool.submit(futureTask);
        System.out.println("CallableThread 占用时间为:" + futureTask.get());
    }
}
