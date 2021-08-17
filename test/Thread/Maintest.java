package Thread;

public class Maintest {


    public static void main(String[] args) {
        Resourece resourece = new Resourece();
        Producer p1 = new Producer(resourece);
        Producer p2 = new Producer(resourece);
        Cunsumer c1 = new Cunsumer(resourece);
        Cunsumer c2 = new Cunsumer(resourece);

        new Thread(c1,"C1").start();
        new Thread(p1,"P1").start();
        new Thread(c2,"C2").start();
        new Thread(p2,"P2").start();
    }
}
