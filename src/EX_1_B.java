
/**
 * Write a java program that display the roots of a quadratic equation
 * ax2+bx=0. Calculate the discriminate D and basing on value of D, describe
 * the nature of root.
 */
import java.util.Scanner;

public class EX_1_B {
    public static void main(String[] Strings) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Take coefficient values from the user
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();

        // Close scanner
        input.close();

        // Calculate discriminant
        double discriminant = b * b - 4.0 * a * c;

        // Calculate the roots
        if (discriminant < 0.0) {
            System.out.println("Roots are not real.");
        } else {
            double r1 = (-b + Math.pow(discriminant, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(discriminant, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        }
    }
}