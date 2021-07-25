import java.util.Scanner;

/**
 * write a java program for creation of user defined exception
 */

class Heekiption extends Exception {
    public Heekiption(String msg) {
        super("Plank session failed: " + msg);
    }

    public Heekiption(int timer) {
        super(timer < 5 ? "Plank session failed : Under Time" : "Plank session failed : Heeki Dead");
    }
}

public class EX_9_D {

    public static void main(String[] args) {
        // Testing Exception for trimmer error
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Case 1 ==>");
            System.out.print("Enter present timer count: ");
            int timer = input.nextInt();
            input.close();
            if (timer > 5 && timer < 9)
                System.out.println("Continue the Plank Session");
            else
                throw new Heekiption(timer);

        } catch (Heekiption e) {
            System.out.println("Exception: " + e.getMessage());
        }
        // Testing Exception for custom message error
        try {
            System.out.println("\nCase 2 ==>");
            throw new Heekiption("Heeki went to snack break");
        } catch (Heekiption e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}