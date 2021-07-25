/**
 * write a program illustrating isAlive() and join() methods in Thread class.
 */
class SampleThread extends Thread {
    String name;

    // taking name from constructor so its easy to track threads in print statements
    SampleThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " Status : " + this.isAlive());

        // thread counts till 3 for every 500msec
        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(500);
                System.out.println("[" + name + "] : " + i);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class EX_10_B extends Thread {
    public static void main(String[] args) {

        // creating three threads
        SampleThread t1 = new SampleThread("T1");
        SampleThread t2 = new SampleThread("T2");
        SampleThread t3 = new SampleThread("T3");

        // t1 starts to count till 3 and then dies
        t1.start();

        // making process to wait till t1 dies after which t2 and t3 will start
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        // t2 and t3 will start now and count simultaneously
        t2.start();
        t3.start();

        // making process to wait till t2 and t3 dies after which print
        // statement executes and main thread dies
        try {
            t2.join(3000);
            t3.join(3000);
        } catch (Exception e) {
            System.out.println(e);
        }

        // main thread will print the status of t1 and t2 and t3 and dies
        System.out.println(t1.name + " Status : " + t1.isAlive());
        System.out.println(t2.name + " Status : " + t2.isAlive());
        System.out.println(t3.name + " Status : " + t3.isAlive());
    }
}