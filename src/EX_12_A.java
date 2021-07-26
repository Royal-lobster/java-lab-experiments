/**
 * write a java program illustrating class path
 */
public class EX_12_A {
    public static void main(String[] args) {
        String path = System.getProperty("java.class.path");
        System.out.println("Class Path: " + path);
    }
}
