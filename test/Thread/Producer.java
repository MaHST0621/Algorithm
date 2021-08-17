package Thread;

public class Producer implements Runnable{
    private Resourece resourece;

    public Producer(Resourece  resourece) {
        this.resourece = resourece;
    }

    @Override
    public void run() {
        while (true) {
            resourece.put();
        }
    }
}
