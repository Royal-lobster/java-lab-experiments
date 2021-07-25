/**
 * write a java program that creates threads by extending Thread class. First
 * thread display "Good Morning" every 1 second. Second thread display "Hello"
 * every 2 second. Third thread display "Welcome" every 3 second. Repeat the
 * same by implementing Runnable interface.
 */
public class EX_10_A {
    public static void main(String[] args) {
        // create a thread by extending Thread class
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                // display "Good Morning" every 1 second
                for (int i = 0; i < 10; i++) {
                    System.out.println("Good Morning");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        // create a thread by extending Thread class
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                // display "Hello" every 2 second
                for (int i = 0; i < 10; i++) {
                    System.out.println("Hello");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        // create a thread by extending Thread class
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                // display "Welcome" every 3 second
                for (int i = 0; i < 10; i++) {
                    System.out.println("Welcome");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        // start the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
