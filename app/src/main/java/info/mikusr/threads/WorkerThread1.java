package info.mikusr.threads;

import java.util.Scanner;

public class WorkerThread1 extends Thread {
    public final Scanner scanner = new Scanner(System.in);

    public WorkerThread1(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            System.out.println("number: " + number);
        }
        scanner.close();
        System.out.println(getName() + " finished");
    }
}
