package ThreadPool;

import java.util.concurrent.*;

/**
 * @description: submit and execute
 * @author mahe
 * @date: 2022/1/29
 */
public class ThreadPoolExecute_01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = new ThreadPoolExecutor(5,10,1000, TimeUnit.SECONDS,new LinkedBlockingQueue<>(10));
        for (int i = 0;i < 4;i++) {
            service.submit(new RunnableTask.RunnableDemo());
        }
        Future future = service.submit(new CallableTask.CallableDemo());
        int res = (int) future.get();
        System.out.println("result: " + res);
    }
}
