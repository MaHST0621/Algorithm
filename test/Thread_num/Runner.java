package Thread_num;

public class Runner implements Runnable{
    private Resource resource;

    public Runner(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                resource.ouput();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
