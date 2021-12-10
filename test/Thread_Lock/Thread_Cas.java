package Thread_Lock;

import java.util.concurrent.atomic.AtomicInteger;

public class Thread_Cas {
//    public static AtomicInteger num = new AtomicInteger(0);
    public  static Integer num = 1;
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Thread t  = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (num < 1000) {
                        synchronized (this) {
                            System.out.println(num++ + "  " + Thread.currentThread().getName());
                        }
                    }
                }
            });
            t.start();
        }
    }
}
