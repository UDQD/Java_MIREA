package pac;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Frame extends JFrame {
    JTextField jta = new JTextField(25);
    JTextField jta2 = new JTextField(25);
    JTextArea txtArea = new JTextArea(1,26);

    JButton but1 = new JButton("+");
    JButton but2 = new JButton("-");
    JButton but3 = new JButton("X");
    JButton but4 = new JButton("/");

    boolean chek(String x){
        try{
            Double.parseDouble(x);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    Font fnt = new Font("Times new roman",Font.BOLD,20);
    Frame()
    {


        super("Example");
        setLayout(new FlowLayout());
        setSize(500,200);



        add(jta);
        jta.setForeground(Color.RED);
        jta.setFont(fnt);

        add(jta2);
        jta2.setForeground(Color.RED);
        jta2.setFont(fnt);

        add(txtArea);
        txtArea.setFont(fnt);

        add(but1);
        add(but2);
        add(but3);
        add(but4);
        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jta.getText().equals("") || !chek(jta.getText())) {
                    jta.setText("0");
                }
                if (jta2.getText().equals("") || !chek(jta2.getText())) {
                    jta2.setText("0");
                }
                double a = Double.parseDouble(jta.getText());
//                System.out.println("a = "+a);
                double b = Double.parseDouble(jta2.getText());
//                System.out.println("b = "+b);
                double c = a + b;
//                System.out.println("c = "+c);
                txtArea.setText(String.valueOf(c));


            }
        });
        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jta.getText().equals("") || !chek(jta.getText())) {
                    jta.setText("0");
                }
                if (jta2.getText().equals("") || !chek(jta2.getText())) {
                    jta2.setText("0");
                }
                double a = Double.parseDouble(jta.getText());
                System.out.println("a = "+a);
                double b = Double.parseDouble(jta2.getText());
                System.out.println("b = "+b);
                double c = a - b;
                System.out.println("c = "+c);
                txtArea.setText(String.valueOf(c));

            }
        });
        but3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jta.getText().equals("") || !chek(jta.getText())) {
                    jta.setText("0");
                }
                if (jta2.getText().equals("") || !chek(jta2.getText())) {
                    jta2.setText("0");
                }
                double a = Double.parseDouble(jta.getText());
                System.out.println("a = "+a);
                double b = Double.parseDouble(jta2.getText());
                System.out.println("b = "+b);
                double c = a * b;
                System.out.println("c = "+c);
                txtArea.setText(String.valueOf(c));

            }
        });
        but4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jta.getText().equals("") || !chek(jta.getText())) {
                    jta.setText("0");
                }
                if (jta2.getText().equals("") || !chek(jta2.getText())) {
                    jta2.setText("0");
                }
                double a = Double.parseDouble(jta.getText());
                System.out.println("a = "+a);
                double b = Double.parseDouble(jta2.getText());
                System.out.println("b = "+b);
                double c = a / b;
                System.out.println("c = "+c);
                txtArea.setText(String.valueOf(c));

            }
        });

        setVisible(true);
    }


}
