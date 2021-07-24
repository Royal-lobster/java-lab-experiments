/**
 * Write a java program to implement constructor overloading
 */

class Customer {
    private String name;
    private int age;
    private String city;

    public Customer(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Customer(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("====================");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("====================");
    }
}

public class EX_4_A {

    public static void main(String[] args) {
        Customer c1 = new Customer("John", 25, "New York");
        Customer c2 = new Customer("John", 25);
        Customer c3 = new Customer("John");
        c1.display();
        c2.display();
        c3.display();
    }
}