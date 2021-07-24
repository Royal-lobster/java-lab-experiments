/**
 * Write a java program to illustrate the use of "Super" keyword
 */

class Person {
    String name;

    Person(String input_name){
        name = input_name;
        System.out.println("Created Person " + name);
    }
    public void does() {
        System.out.println("Does ===>");
        System.out.println("1. Living");
    }
}

class Student extends Person {
    String roll;

    Student(String input_name, String input_roll){
        super(input_name);
        roll = input_roll;
        System.out.println("Created Student " + roll);
    }
    public void does() {
        super.does();
        System.out.println("2. Studying");
    }
    public void info() {
        System.out.println("Info ===>");
        System.out.println("Name: " + super.name);
        System.out.println("Roll: " + roll);
    }
}

public class EX_6_A {
    public static void main(String[] args) {
        Student srujan = new Student("Srujan", "19VV1A1220");
        srujan.does();
        srujan.info();
    }
}