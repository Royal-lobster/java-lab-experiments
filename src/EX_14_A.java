
/**
 * write a java program to display the x and y position of the cursor
 */
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class EX_14_A extends Applet implements MouseMotionListener {
    int xPos, yPos;

    public void init() {
        addMouseMotionListener(this);
        setBackground(Color.darkGray);
    }

    public void mouseDragged(MouseEvent me) {
    }

    public void mouseMoved(MouseEvent me) {
        xPos = me.getX();
        yPos = me.getY();
        repaint();
    }

    public void paint(Graphics g) {
        Dimension d = getSize();
        g.setColor(Color.white);
        g.drawString("X-Pos : " + xPos, d.width / 2 - 30, d.height / 2 - 10);
        g.drawString("Y-Pos : " + yPos, d.width / 2 - 30, d.height / 2 + 10);
    }

}