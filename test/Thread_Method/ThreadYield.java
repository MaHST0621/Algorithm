package Thread_Method;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadYield {
    private static HashMap<String, AtomicInteger> map = new HashMap<>();
    private static int MAX_TURN = 500;
    private static int ThreadSeqId = 1;
    private static AtomicInteger index = new AtomicInteger();

    static class ThreadYieldDemo extends Thread{
        public ThreadYieldDemo() {
            super("threadYieldDemo-" + ThreadSeqId++);
            map.put(this.getName(),new AtomicInteger(0));
        }

        public void run() {
            for (int i = 0; i < MAX_TURN && index.get() < MAX_TURN; i++) {
                index.incrementAndGet();
                System.out.println(this.getName() + " " + this.getPriority());
                map.get(this.getName()).incrementAndGet();

                if (i % 2 == 0) {
                    this.yield();
                }
            }
            System.out.println(this.getName() + " 执行结束" + map);
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new ThreadYieldDemo();
        thread1.setPriority(10);

        Thread thread2 = new ThreadYieldDemo();
        thread2.setPriority(1);

        thread1.start();
        thread2.start();
    }
}
