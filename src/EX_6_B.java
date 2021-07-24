/**
 * Write a java program to implement Interface.
 * What kind of inheritance can be achieved ?
 */
interface polygon {
    void area();
    void perimeter();
}

class Rectangle implements polygon {
    int height, width;
    Rectangle(int height, int width){
        System.out.println("Rectangle created");
        this.height = height;
        this.width = width;
    }
    public void area(){
        System.out.println("Area of rectangle is " + height * width);
    }
    public void perimeter(){
        System.out.println("Perimeter of rectangle is " + (2 * height) + (2 * width));
    }
}

public class EX_6_B {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        rect.area();
        rect.perimeter();
    }
    
}