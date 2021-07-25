
/**
 * Five Bikers Compete in a race such that they drive at a constant speed
 * which may or may not be the same as the other. To qualify the race, the
 * speed of a racer must be more than the average speed of all 5 racers. Take
 * as input the speed of each racer and print back the speed of qualifying
 * racers.
 */

import java.util.Scanner;

public class EX_1_C {
    public static void main(String[] args) {
        // Initialize given variables
        int speeds[] = new int[5];
        int average = 0;

        // Initialize scanner
        Scanner input = new Scanner(System.in);

        // Prompt user for input and store it in speeds array
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Racer S" + i + " Speed: ");
            int speed = input.nextInt();
            speeds[i] = speed;
            average = average + speed;
        }

        // close the scanner
        input.close();

        // calculate average speed
        average = average / 5;

        // Print out the speed of the qualifying racers by comparing in loop
        System.out.print("Qualified Racers are:");
        for (int i = 0; i < 5; i++) {
            // if the speed of a current racer is greater
            // than the average speed then print
            if (speeds[i] > average) {
                System.out.print(" S" + i);
            }
        }
    }
}