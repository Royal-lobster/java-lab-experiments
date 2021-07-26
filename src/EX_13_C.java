
/**
 * write a java program to create different shapes and fill colors using applets
 */
import java.applet.*;
import java.awt.*;

public class EX_13_C extends Applet {
    // Function to initialize the applet
    public void init() {
        setBackground(Color.darkGray);
    }

    // Function to draw and fill shapes
    public void paint(Graphics g) {
        // Draw a square
        g.setColor(Color.white);
        g.drawString("Square", 75, 200);
        int x[] = { 50, 150, 150, 50 };
        int y[] = { 50, 50, 150, 150 };
        g.setColor(Color.black);
        g.drawPolygon(x, y, 4);
        g.setColor(Color.red);
        g.fillPolygon(x, y, 4);

        // Draw a pentagon
        g.setColor(Color.white);
        g.drawString("Pentagon", 225, 200);
        x = new int[] { 200, 250, 300, 300, 250, 200 };
        y = new int[] { 100, 50, 100, 150, 150, 100 };
        g.setColor(Color.black);
        g.drawPolygon(x, y, 6);
        g.setColor(Color.yellow);
        g.fillPolygon(x, y, 6);

        // Draw a circle
        g.setColor(Color.white);
        g.drawString("Circle", 400, 200);
        g.setColor(Color.black);
        g.drawOval(350, 50, 125, 125);
        g.setColor(Color.magenta);
        g.fillOval(350, 50, 125, 125);

        // Draw an oval
        g.setColor(Color.white);
        g.drawString("Oval", 100, 380);
        g.setColor(Color.black);
        g.drawOval(50, 250, 150, 100);
        g.setColor(Color.orange);
        g.fillOval(50, 250, 150, 100);

        // Draw a rectangle
        g.setColor(Color.white);
        g.drawString("Rectangle", 300, 380);
        g.setColor(Color.black);
        x = new int[] { 250, 450, 450, 250 };
        y = new int[] { 250, 250, 350, 350 };
        g.drawPolygon(x, y, 4);
        g.setColor(Color.green);
        g.fillPolygon(x, y, 4);

        // Draw a triangle
        g.setColor(Color.white);
        g.drawString("Traingle", 100, 525);
        g.setColor(Color.black);
        x = new int[] { 50, 50, 200 };
        y = new int[] { 500, 400, 500 };
        g.drawPolygon(x, y, 3);
        g.setColor(Color.blue);
        g.fillPolygon(x, y, 3);
    }
}