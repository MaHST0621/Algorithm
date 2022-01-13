package Thread_Create;

public class CreateThread2 {
    private static final int MAX_TURN = 5;
    private static final int id = 1;

    static class DemoThread implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < MAX_TURN;i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }

            System.out.println(Thread.currentThread().getName() + " 运行完毕");
        }
    }

    public static void main(String[] args) {
        Thread thread = null;
        Runnable runnable = new DemoThread();
        for (int i = 0; i < 3;i++) {
            //lambda 函数式run()
            thread = new Thread(() -> {
                for (int j = 0; j < MAX_TURN;j++) {
                    System.out.println(Thread.currentThread().getName() + " : " + j);
                }

                System.out.println(Thread.currentThread().getName() + " 运行完毕");
            });
            thread.start();
        }
        System.out.println(Thread.currentThread().getName() + " 运行完毕");
    }
}
