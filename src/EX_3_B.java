/**
 * write a java program to implement constructor
 */

class Scholar {
    String name;
    int age;
    String roll;

    Scholar(String input_name, int input_age, String input_roll) {
        name = input_name;
        age = input_age;
        roll = input_roll;
        System.out.println("Scholar created");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll: " + roll);
    }
}

public class EX_3_B {
    public static void main(String[] args) {
        Scholar srujan = new Scholar("Srujan", 19, "19VV1A1220");
        srujan.display();
    }
}