
/**
 * write a java program to build a calculator using swings
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EX_15_A {
    public static void main(String[] args) {
        new calculator();
    }
}

class calculator implements ActionListener {
    // Data fields
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnPlus, btnMinus, btnMultiply, btnDivide,
            btnEqual, btnClear;
    JTextField display;

    // Styled buttons for calculator
    class StyledBtn extends JButton {
        StyledBtn(String input, JPanel panel, ActionListener listener) {
            super(input);

            // Button Styles
            if (input == "*" || input == "/" || input == "+" || input == "-")
                this.setBackground(new Color(0xff3646));
            else if (input == "=")
                this.setBackground(new Color(0xb83ae6));
            else if (input == "C")
                this.setBackground(new Color(0xfb5235));
            else
                this.setBackground(Color.gray);
            this.setPreferredSize(new Dimension(90, 70));
            this.setForeground(Color.white);
            this.setBorder(BorderFactory.createLineBorder(Color.darkGray));
            this.setFont(new Font("Courier", Font.BOLD, 24));

            // Add the button to the panel and set the action listeners
            panel.add(this);
            this.addActionListener(listener);
        }
    }

    // Constructor
    calculator() {
        // create a frame for the calculator
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // create a panel for the display
        JPanel displayPanel = new JPanel();
        displayPanel.setLayout(new GridLayout(1, 1));
        displayPanel.setBackground(Color.darkGray);
        displayPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // create the display
        display = new JTextField(10);
        display.setFont(new Font("Courier", Font.BOLD, 45));
        display.setPreferredSize(new Dimension(400, 200));
        display.setBackground(Color.darkGray);
        display.setBorder(BorderFactory.createLineBorder(Color.darkGray));
        display.setForeground(Color.white);
        display.setEditable(false);
        displayPanel.add(display);

        // create a panel for the buttons
        JPanel btnPanel = new JPanel();
        btnPanel.setLayout(new GridLayout(4, 4, 10, 10));
        btnPanel.setBackground(Color.darkGray);
        btnPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // create the buttons
        btn1 = new StyledBtn("1", btnPanel, this);
        btn2 = new StyledBtn("2", btnPanel, this);
        btn3 = new StyledBtn("3", btnPanel, this);
        btnPlus = new StyledBtn("+", btnPanel, this);

        btn4 = new StyledBtn("4", btnPanel, this);
        btn5 = new StyledBtn("5", btnPanel, this);
        btn6 = new StyledBtn("6", btnPanel, this);
        btnMinus = new StyledBtn("-", btnPanel, this);

        btn7 = new StyledBtn("7", btnPanel, this);
        btn8 = new StyledBtn("8", btnPanel, this);
        btn9 = new StyledBtn("9", btnPanel, this);
        btnMultiply = new StyledBtn("*", btnPanel, this);

        btnClear = new StyledBtn("C", btnPanel, this);
        btn0 = new StyledBtn("0", btnPanel, this);
        btnEqual = new StyledBtn("=", btnPanel, this);
        btnDivide = new StyledBtn("/", btnPanel, this);

        // add all panels to the frame and show frame
        frame.add(displayPanel);
        frame.add(btnPanel);
        frame.pack();
        frame.setVisible(true);

    }

    // method to perform calculation when "=" is pressed
    String performCalculation(String str) {
        // will get all numbers and store it to `numberStr`
        String numberStr[] = str.replaceAll("[+*/()-]+", " ").split(" ");
        // will get all operators and store it to `operatorStr`
        String operatorStr[] = str.replaceAll("[0-9()]+", "").split("");

        int total = Integer.parseInt(numberStr[0]);

        for (int i = 0; i < operatorStr.length; i++) {
            switch (operatorStr[i]) {
                case "+":
                    total += Integer.parseInt(numberStr[i + 1]);
                    break;
                case "-":
                    total -= Integer.parseInt(numberStr[i + 1]);
                    break;
                case "*":
                    total *= Integer.parseInt(numberStr[i + 1]);
                    break;
                case "/":
                    total /= Integer.parseInt(numberStr[i + 1]);
                    break;
            }

            if (i + 2 >= operatorStr.length)
                continue; // if meets the last operands already
            numberStr[i + 1] = String.valueOf(total);

        }
        return String.valueOf(total);
    }

    // handling events by actionPerformed function
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            display.setText(display.getText() + "1");
        } else if (e.getSource() == btn2) {
            display.setText(display.getText() + "2");
        } else if (e.getSource() == btn3) {
            display.setText(display.getText() + "3");
        } else if (e.getSource() == btnPlus) {
            display.setText(display.getText() + "+");
        } else if (e.getSource() == btn4) {
            display.setText(display.getText() + "4");
        } else if (e.getSource() == btn5) {
            display.setText(display.getText() + "5");
        } else if (e.getSource() == btn6) {
            display.setText(display.getText() + "6");
        } else if (e.getSource() == btnMinus) {
            display.setText(display.getText() + "-");
        } else if (e.getSource() == btn7) {
            display.setText(display.getText() + "7");
        } else if (e.getSource() == btn8) {
            display.setText(display.getText() + "8");
        } else if (e.getSource() == btn9) {
            display.setText(display.getText() + "9");
        } else if (e.getSource() == btnMultiply) {
            display.setText(display.getText() + "*");
        } else if (e.getSource() == btn0) {
            display.setText(display.getText() + "0");
        } else if (e.getSource() == btnDivide) {
            display.setText(display.getText() + "/");
        } else if (e.getSource() == btnEqual) {
            String input = display.getText();
            String output = "";
            try {
                output = performCalculation(input);
            } catch (Exception ex) {
                output = "ERROR";
            }
            display.setText(output);
        } else if (e.getSource() == btnClear) {
            display.setText("");
        }
    }
}
