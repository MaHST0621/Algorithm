package Thread_Create;

public class CreateThread {
    private static final int MAX_TURN = 5;

    public static String getCurrentThreadName() {
        return Thread.currentThread().getName();
    }
    private static int threadId = 1;

    static class DemoThread extends Thread {
        public DemoThread () {
            super("DemoThread-" + threadId++);
        }

        @Override
        public void run() {
            for (int i = 0; i < MAX_TURN;i++) {
                System.out.println(getCurrentThreadName() + " : " + i);
            }

            System.out.println(getCurrentThreadName() + " 运行完毕");
        }
    }

    public static void main(String[] args) {
        Thread thread = null;
        for (int i = 0; i < 3;i++) {
            thread = new DemoThread();
            thread.start();
        }
        System.out.println(Thread.currentThread().getName() + " 运行完毕");
    }
}
