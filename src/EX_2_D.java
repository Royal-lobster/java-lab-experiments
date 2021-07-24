/**
 * write a java program using String Buffer to delete, remove character.
 */
public class EX_2_D {
    public static void main(String[] args) {
        // create a string buffer object
        StringBuffer welcome = new StringBuffer("Hello 👋 Srujan");

        // print before deleting string
        System.out.println("Before delete: " + welcome);

        // delete emoji "Hello " - 5 characters and "👋 " - 3 characters (emoji 2 char)
        // (start, end) start is inclusive (5 + 1) and end is exclusive (5+3+1)
        welcome.delete(6, 9);

        // print after deleting string
        System.out.println("After delete: " + welcome);
    }
}