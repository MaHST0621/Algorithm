package Thread_Method;

/**
 * Interrupt
 * 只是将线程的状态设置为中断状态
 * 中断状态只能由自己来解决
 */
public class ThreadInterrupt {
    private static  int MAX_TURN = 5;
    private static int SLEEP_TIME = 5000;
    private static int ThreadSeqId = 1;
    static class ThreadInterruptDemo extends Thread {
        public ThreadInterruptDemo() {
            super("threadInterrupt-" + ThreadSeqId++);
        }

        public void run() {
            for (int i = 0; i < MAX_TURN; i++) {
                try {
                    System.out.println(isInterrupted());
                    sleep(SLEEP_TIME);
                } catch (InterruptedException e) {
                    System.out.println(this.getName() + " 发生中断异常");
                    this.interrupt();
                }
            }
        }

        public static void main(String[] args) throws InterruptedException {
            Thread thread = new ThreadInterruptDemo();
            thread.start();
            sleep(2000);
            thread.interrupt();
        }
    }
}
