
/**
 * write a java program to implement solution of producer-consumer problem
 */

import java.util.LinkedList;

public class EX_11_A {
    public static void main(String[] args) throws InterruptedException {
        // This object contains produce() and consume() methods
        ProducerConsumer pc = new ProducerConsumer();

        // Create a thread for producer
        Thread producerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Create a thread for consumer
        Thread consumerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start threads
        producerThread.start();
        consumerThread.start();

        // Wait for threads to complete
        producerThread.join();
        consumerThread.join();
    }
}

class ProducerConsumer {
    // Create a common list shared by both producer and consumer
    LinkedList<Integer> list = new LinkedList<>();

    // int capacity of the list
    int capacity = 2;

    // function called by producer thread
    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                // if the list is at capacity, wait
                while (list.size() == capacity)
                    wait();

                // Add a new value to the list
                list.add(value++);
                System.out.println("Producer produced : " + value);

                // Notify the consumer
                notify();

                // sleep for 1 second to simulate the time taken by producer
                Thread.sleep(1000);
            }
        }
    }

    // function called by consumer thread
    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                // if the list is empty, wait
                while (list.isEmpty())
                    wait();

                // retrieve first job in the list
                int consumed = list.removeFirst();
                System.out.println("Consumer consumed : " + consumed);

                // Notify the producer
                notify();

                // sleep for 1 second to simulate the time taken by consumer
                Thread.sleep(1000);
            }
        }
    }
}
