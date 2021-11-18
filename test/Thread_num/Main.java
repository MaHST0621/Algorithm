package Thread_num;

public class Main {
    public static void main(String[] args) {
        Resource resource = new Resource();
        Runner runner1 = new Runner(resource);
        Runner runner2 = new Runner(resource);
        Runner runner3 = new Runner(resource);

        new Thread(runner1, "c1").start();
        new Thread(runner2, "c2").start();
        new Thread(runner3, "c3").start();

    }
}
