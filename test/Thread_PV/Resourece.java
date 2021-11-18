package Thread_PV;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Resourece {
    private volatile int num;
    private volatile int size = 50;

    private Lock lock = new ReentrantLock();

    private Condition full = lock.newCondition();

    private Condition empty = lock.newCondition();

    public void remove() {
        lock.lock();
        while (num == 0) {
            try {
                empty.await();
                System.out.println(Thread.currentThread().getName()+"消费者阻塞");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        num--;
        System.out.println("消费者线程为:" + Thread.currentThread().getName() + "--资源数量:" + num);
        full.signalAll();//唤醒其他正在等待
        lock.unlock();
    }

    public void put() {
        lock.lock();
        while (num == size) {
            try {
                System.out.println(Thread.currentThread().getName()+"生产者阻塞");
                full.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        num++;
        System.out.println("生产者线程为："+Thread.currentThread().getName() + "--资源数量" + num);
        empty.signalAll();
        lock.unlock();
    }
}
