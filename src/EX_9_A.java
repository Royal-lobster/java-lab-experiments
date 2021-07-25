/**
 * write a java program for creation of illustrating throw statement.
 */
public class EX_9_A {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException("Division by zero not Allowed");
        } catch (Exception e) {
            System.out.println("Exception caught");
            System.out.println("Exception message: " + e.getMessage());
        }
    }
}