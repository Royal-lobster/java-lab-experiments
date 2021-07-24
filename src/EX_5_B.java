/**
 * EX_5_B
 */
class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}

class FlyingDog extends Dog {
    void fly() {
        System.out.println("flying...");
    }
}

public class EX_5_B {
    public static void main(String[] args) {
        FlyingDog dalgomi = new FlyingDog();
        dalgomi.fly();
        dalgomi.bark();
        dalgomi.eat();
    }
}