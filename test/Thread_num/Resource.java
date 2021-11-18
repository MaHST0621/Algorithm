package Thread_num;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Resource {
    private int num;

    private Lock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    public Resource() {
        this.num = 1;
    }

    public void ouput() throws InterruptedException {
        lock.lock();
        if (num > 3) {
            num = 1;
        }
        System.out.println(Thread.currentThread().getName() + " sout : " + num++);
        condition.signalAll();
        condition.await();
        lock.unlock();
    }
}
