package test;

import sun.nio.ch.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author Mahe
 * @Date 2021/5/2 14:04
 * @Version 1.0
 */

public class ThreadpoolTest {


	MyThread001 myThread0 = new MyThread001();

	Thread t1 = new Thread(myThread0);
	Thread t2 = new Thread(myThread0);
	Thread t3 = new Thread(myThread0);
	Thread t4 = new Thread(myThread0);
	Thread t5 = new Thread(myThread0);


}

class MyThread001 implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "is Running!");
	}
}
