package pac;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Frame extends JFrame {

    JButton milan_but = new JButton("AC Milan");
    JButton madrid_but = new JButton("Real Madrid");
    JLabel result_lable = new JLabel("Result: 0 X 0");
    JLabel last_lable = new JLabel("Last Scorer: N/A");
    JLabel winner_lable = new JLabel("Winner: DRAW");
    Frame(Score score){

        super("Score");
        JPanel[] pnl = new JPanel[9];
        setLayout(new GridLayout(3,3));

        for(int i = 0 ; i < pnl.length ; i++){
            pnl[i] = new JPanel();
            add(pnl[i]);
        }
        milan_but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        setSize(500,300);
        pnl[0].add(milan_but);
        pnl[2].add(madrid_but);
        pnl[1].add(result_lable);
        pnl[4].add(last_lable);
        pnl[7].add(winner_lable);
        setVisible(true);

    }





}
