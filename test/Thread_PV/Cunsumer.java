package Thread_PV;

public class Cunsumer implements Runnable{
    private Resourece resourece;

    public Cunsumer(Resourece resourece) {
        this.resourece = resourece;
    }


    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3000);
                resourece.remove();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
