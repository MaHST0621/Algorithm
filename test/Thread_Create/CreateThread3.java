package Thread_Create;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CreateThread3 {
        private static int MAXTURN = 5;

        static class DemoThread implements Callable {
            @Override
            public Object call() throws Exception {
                final long start = System.currentTimeMillis();
                int j = 1;
                for (int i = 0; i < 100000000; i++) {
                    j = i * 1000000000;
                }

                final long end = System.currentTimeMillis();
                System.out.println(Thread.currentThread().getName() + " : 执行完毕");

                return end - start;
            }
        }


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        DemoThread demoThread = new DemoThread();
        FutureTask futureTask = new FutureTask<>(demoThread);
        Thread thread = new Thread(futureTask);
        thread.start();
        for (int i = 0; i < 100000; i++) {
            i = i * 10000;
        }
        System.out.println(Thread.currentThread().getName() + " 执行完毕");
        System.out.println(thread.getName() + " 执行完毕，用时: " + futureTask.get());
    }
}
