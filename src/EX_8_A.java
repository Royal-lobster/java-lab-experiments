/**
 * Write a java program that implements runtime polymorphism
 */

class Bike {
    void run() {
        System.out.println("running");
    }
}

class Splendor extends Bike {
    void run() {
        System.out.println("running safely with 60km");
    }
}

public class EX_8_A {
    public static void main(String args[]) {
        Bike b = new Splendor();
        b.run();
    }
}