
/**
 * write a java program for creation of java built in exceptions
 */
import java.io.*;

public class EX_9_C {
    public static void main(String[] args) {
        ArithmeticExceptionDemo();
        ArrayIndexOutOfBoundsExceptionDemo();
        FileNotFoundExceptionDemo();
    }

    public static void ArithmeticExceptionDemo() {
        try {
            int a = 30, b = 0;
            int c = a / b; // cannot divide by zero
            System.out.println("Result = " + c);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

    public static void ArrayIndexOutOfBoundsExceptionDemo() {
        try {
            int a[] = new int[5];
            a[6] = 9; // accessing 7th element in an array of
            // size 5
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    public static void FileNotFoundExceptionDemo() {
        try {
            // Following file does not exist
            File file = new File("E://file.txt");
            FileReader fileRead = new FileReader(file);
            System.out.println(fileRead);

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } finally {
        }
    }
}
