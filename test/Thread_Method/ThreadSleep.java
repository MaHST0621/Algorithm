package Thread_Method;

public class ThreadSleep {
    private static Integer SLEEP_TIME = 5000;
    private static Integer SLEEP_TURN = 50;
    private static Integer threadSeqId = 1;
    static class ThreadSleepDemo extends Thread {
        public ThreadSleepDemo() {
            super("threadSleepDemo-" + threadSeqId++);
        }

        @Override
        public void run() {
            for (int i = 0; i < SLEEP_TURN;i++) {
                System.out.println(this.getName() + "轮询次: " + i);
                try {
                    sleep(SLEEP_TIME);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(this.getName() + "轮询结束");
        }
    }

    public static void main(String[] args) {
        Thread thread = null;
        for (int i = 0; i < 2; i++) {
            thread = new ThreadSleepDemo();
            thread.start();
        }
    }
}
