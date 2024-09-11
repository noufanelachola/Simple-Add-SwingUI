import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Add");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());

        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);

        JButton b1 = new JButton("Add");

        JTextField t3 = new JTextField(10);

        frame.add(t1);
        frame.add(t2);
        frame.add(b1);
        frame.add(t3);

        frame.setVisible(true);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t3.setText(Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText())+"");
            }
        });

    }
}