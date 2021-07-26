
/**
 * write a java program to paint like a paint brush in applet
 */
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class EX_13_A extends Applet implements MouseMotionListener {

    public void init() {
        addMouseMotionListener(this);
        setBackground(Color.darkGray);
    }

    public void mouseDragged(MouseEvent me) {
        Graphics g = getGraphics();
        g.setColor(Color.white);
        g.fillOval(me.getX(), me.getY(), 10, 5);
    }

    public void mouseMoved(MouseEvent me) {
    }

}