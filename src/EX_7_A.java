/**
 * Write a java program that describes exception handling mechanism.
 */
public class EX_7_A {
    public static void main(String[] args) throws ArithmeticException {
        try {
            throw new ArithmeticException("Division by zero");
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        finally{
            System.out.println("Final block");
        }

    }
}