
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
        StyledBtn(String input) {
            super(input);
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
        btn2 = new StyledBtn("2");
        btn3 = new StyledBtn("3");
        btn1 = new StyledBtn("1");
        btnPlus = new StyledBtn("+");
        btn4 = new StyledBtn("4");
        btn5 = new StyledBtn("5");
        btn6 = new StyledBtn("6");
        btnMinus = new StyledBtn("-");
        btn7 = new StyledBtn("7");
        btn8 = new StyledBtn("8");
        btn9 = new StyledBtn("9");
        btnMultiply = new StyledBtn("*");
        btn0 = new StyledBtn("0");
        btnClear = new StyledBtn("C");
        btnEqual = new StyledBtn("=");
        btnDivide = new StyledBtn("/");

        // add the buttons to the panel
        btnPanel.add(btn1);
        btnPanel.add(btn2);
        btnPanel.add(btn3);
        btnPanel.add(btnPlus);

        btnPanel.add(btn4);
        btnPanel.add(btn5);
        btnPanel.add(btn6);
        btnPanel.add(btnMinus);

        btnPanel.add(btn7);
        btnPanel.add(btn8);
        btnPanel.add(btn9);
        btnPanel.add(btnMultiply);

        btnPanel.add(btn0);
        btnPanel.add(btnClear);
        btnPanel.add(btnEqual);
        btnPanel.add(btnDivide);

        // add event listeners to all the buttons
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btnPlus.addActionListener(this);

        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btnMinus.addActionListener(this);

        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btnMultiply.addActionListener(this);

        btn0.addActionListener(this);
        btnDivide.addActionListener(this);
        btnEqual.addActionListener(this);
        btnClear.addActionListener(this);

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
