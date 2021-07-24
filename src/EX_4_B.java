/**
 * write a java program to implement method overloading
 */

class SuperMan {
    int default_speed = 100;
    String default_vehicle = "flying";

    void rescue() {
        System.out.println("SuperMan will rescue by " + default_vehicle + " with speed " + default_speed);
    }

    void rescue(int speed) {
        System.out.println("SuperMan will rescue by " + default_vehicle + " with speed " + speed);
    }

    void rescue(String vehicle) {
        System.out.println("SuperMan will rescue by " + vehicle + " with speed " + default_speed);
    }

    void rescue(String vehicle, int speed) {
        System.out.println("SuperMan will rescue by " + vehicle + " with speed " + speed);
    }
}

public class EX_4_B {
    public static void main(String[] args) {
        SuperMan superMan = new SuperMan();
        superMan.rescue();
        superMan.rescue(200);
        superMan.rescue("Car");
        superMan.rescue("Bike", 50);

    }
}