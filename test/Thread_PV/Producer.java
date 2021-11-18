package Thread_PV;

public class Producer implements Runnable{
    private Resourece resourece;
    public Producer(Resourece  resourece) {
        this.resourece = resourece;
    }

    @Override
    public void run() {
        while (true) {
            try {
                ThreadLocal<String> st = new ThreadLocal<>();
                st.set("ss");
                Thread.sleep(1000);
                resourece.put();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
