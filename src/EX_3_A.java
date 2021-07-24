/**
 * write a java program to implement class mechanism create class, methods and
 * invoke them inside main method
 */
class Calculator {

    public void add(int a, int b) {
        System.out.println("Addition is " + (a + b));
    }

    public void sub(int a, int b) {
        System.out.println("Subtraction is " + (a - b));
    }

    public void mul(int a, int b) {
        System.out.println("Multiplication is " + (a * b));
    }

    public void div(int a, int b) {
        System.out.println("Division is " + (a / b));
    }

}

public class EX_3_A {
    public static void main(String[] args) {
        Calculator calsy = new Calculator();
        calsy.add(10, 20);
        calsy.sub(30, 20);
        calsy.mul(10, 20);
        calsy.div(10, 2);
    }
}