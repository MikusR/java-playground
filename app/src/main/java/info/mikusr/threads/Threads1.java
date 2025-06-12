package info.mikusr.threads;

class Threads1 {
    public static void main(String[] no) {
        Thread wrkt = new WorkerThread1("wrkt1");
        Thread hi1 = new WorkerThread2("hi1");
        Thread hi2 = new WorkerThread2("hi2");
        wrkt.start();
        hi1.start();
        hi2.start();
        while (true) {
            try {
                Thread.sleep(10000);
                System.out.println("Hi from main");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}