package Thread;

public class Resourece {
    private volatile int num;
    private volatile int size = 50;

    public synchronized void remove() {
        while (num == 0) {
            try {
                this.wait();
                System.out.println(Thread.currentThread().getName()+"消费者阻塞");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        num--;
        System.out.println("消费者线程为:" + Thread.currentThread().getName() + "--资源数量:" + num);
        this.notify();//唤醒其他正在等待的线程
    }

    public synchronized void put() {
        while (num == size) {
            try {
                System.out.println(Thread.currentThread().getName()+"生产者阻塞");
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        num++;
        System.out.println("生产者线程为："+Thread.currentThread().getName() + "--资源数量" + num);
        this.notify();
    }
}
