package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;
    private JTextField textField;
    private JButton button;
    private JLabel label;

    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(400, 200));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new GridLayout(3, 1));
        
        textField = new JTextField();
        container.add(textField);
        
        button = new JButton("Copy!");
        container.add(button);
        
        label = new JLabel();
        container.add(label);
        
        button.addActionListener(new ActionEventListener(textField, label));
    }
}
