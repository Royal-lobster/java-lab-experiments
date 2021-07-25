/**
 * write a java program for creation of illustrating finally block
 */
public class EX_9_B {
    public static void main(String[] args) {
        System.out.println("==Finally After Try Block==");
        finallyAfterTry();
        System.out.println("\n==Finally After Catch Block==");
        finallyAfterCatch();
    }

    public static void finallyAfterTry() {
        try {
            System.out.println("try block : Contains no code that gives exception");
        } catch (Exception e) {
            System.out.println("catch block : This line doesn't get executed");
        } finally {
            System.out.println("finally block : Always executes");
        }
    }

    public static void finallyAfterCatch() {
        try {
            System.out.println("try block : Contains code that gives exception");
            throw new Exception();
        } catch (Exception e) {
            System.out.println("catch block : Executes if there is an exception in try");
        } finally {
            System.out.println("finally block : Always executes");
        }
    }
}