package Thread;

public class Cunsumer implements Runnable{
    private Resourece resourece;

    public Cunsumer(Resourece resourece) {
        this.resourece = resourece;
    }


    @Override
    public void run() {
        while (true) {
            resourece.remove();
        }
    }
}
