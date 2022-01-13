package Thread_Method;

import java.util.ArrayList;
import java.util.List;

/**
 * join作为一个等待点
 */
public class Threadjoin {
    private static List<Integer> list = new ArrayList<>();

    static class Thread_A extends Thread {
        @Override
        public void run() {
            Thread thread_b = new Thread_B();
            thread_b.start();
            System.out.println(this.getName() + " 创建完毕");
            try {
                thread_b.join(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("我要开动了");
            for (int i : list) {
                System.out.println(i + " ");
            }
        }
    }

    static class Thread_B extends Thread {
        @Override
        public void run() {
            System.out.println(this.getName() + " 创建完毕");
            for (int i = 0; i < 50; i++) {
                list.add(i);
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread_A();
        thread.start();
    }
}
