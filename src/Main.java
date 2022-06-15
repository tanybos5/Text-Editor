import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static JFrame frame = new JFrame();
    static JPanel panel = new JPanel();

    public static void main(String[] args) {

        int i = 5;

        //sets
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel();
        JButton bEdit = new JButton();
        JButton bFile = new JButton();
        JButton bFormat = new JButton();
        JButton bView = new JButton();
        JButton bHelp = new JButton();

        panel.setBackground(Color.BLACK);

        frame.add(panel);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JTextArea t1 = new JTextArea();
        t1.setBackground(Color.BLACK);
        t1.setPreferredSize(new Dimension(panel.getWidth(), panel.getHeight()));
        t1.setForeground(Color.GREEN);
        t1.setCaretColor(Color.WHITE);
        t1.setFont(t1.getFont().deriveFont(20f));
        t1.setCaretColor(Color.WHITE);
        ;
        frame.add(t1);
        frame.pack();

    }

}
