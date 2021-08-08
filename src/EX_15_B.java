
/**
 * write a java program to display the digital watch by using swing components.
 */
import javax.swing.*;
import java.awt.*;
import java.time.*;

public class EX_15_B extends JFrame {
    public static void main(String[] args) {
        DigitalClock clock = new DigitalClock();
        clock.start();
    }
}

class DigitalClock extends Thread {
    @Override
    public void run() {
        // create a frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.darkGray);
        frame.setSize(600, 400);
        frame.setResizable(false);
        frame.setLayout(new GridLayout(1, 1));

        // create a clock label
        JLabel clock = new JLabel();
        clock.setOpaque(true);
        clock.setBackground(Color.darkGray);
        clock.setForeground(Color.WHITE);
        clock.setFont(new Font("Courier", Font.BOLD, 60));
        clock.setHorizontalAlignment(JLabel.CENTER);

        // update the label every 1 second with latest time
        while (true) {
            LocalTime time = java.time.LocalTime.now();
            clock.setText(time.toString().substring(0, 8));
            frame.add(clock);
            frame.setVisible(true);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}