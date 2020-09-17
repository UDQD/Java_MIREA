package pac;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Frame extends JFrame {
    JTextField jta = new JTextField(10);
//    JTextField jta2 = new JTextField(10);

    JButton but1 = new JButton("+1");
    JButton but2 = new JButton("-1");
    JButton but3 = new JButton("X2");
    JButton but4 = new JButton("/2");

    Font fnt = new Font("Times new roman",Font.BOLD,20);
    Frame()
    {


        super("Example");
        setLayout(new FlowLayout());
        setSize(500,500);

        add(jta);
        jta.setForeground(Color.RED);
        jta.setFont(fnt);

//        add(jta2);
//        jta2.setForeground(Color.RED);
//        jta2.setFont(fnt);

        add(but1);
        add(but2);
        add(but3);
        add(but4);
        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jta.getText().equals("")){ jta.setText("0");}
                int out = Integer.parseInt(jta.getText())+1;
                jta.setText(String.valueOf(out));
            }
        });
        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jta.getText().equals("")){jta.setText("0");}
                int out = Integer.parseInt(jta.getText())-1;
                jta.setText(String.valueOf(out));
            }
        });
        but3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jta.getText().equals("")){jta.setText("0");}
                int out = Integer.parseInt(jta.getText())*2;
                jta.setText(String.valueOf(out));
            }
        });
        but4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jta.getText().equals("")){jta.setText("0");}
                int out = Integer.parseInt(jta.getText())/2;
                jta.setText(String.valueOf(out));
            }
        });

        setVisible(true);
    }


}
