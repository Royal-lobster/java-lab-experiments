/**
 * Write a program illustrating Daemon Threads.
 */

class TestingThread extends Thread {
    @Override
    public void run() {

        // print the type of thread
        if (this.isDaemon()) {
            System.out.println("This is a Daemon Thread");
        } else {
            System.out.println("This is a Non-Daemon Thread");
        }
    }
}

public class EX_10_C {
    public static void main(String[] args) {
        // creating two threads
        TestingThread t1 = new TestingThread();
        TestingThread t2 = new TestingThread();

        // making one thread a Daemon Thread
        t1.setDaemon(true);

        // starting the threads
        t1.start();
        t2.start();
    }
}