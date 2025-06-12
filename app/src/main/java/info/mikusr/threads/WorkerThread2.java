package info.mikusr.threads;

public class WorkerThread2 extends Thread {
    public WorkerThread2(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Hi from " + getName());
        while (true) {
            try {
                Thread.sleep(10000);
                System.out.println("Loop hi from " + getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
