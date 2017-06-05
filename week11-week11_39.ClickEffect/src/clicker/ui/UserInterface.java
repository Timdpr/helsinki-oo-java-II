package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {
    private JFrame frame;
    private JLabel label;
    private JButton button;
    private Calculator calculator;
    
    public UserInterface(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new BorderLayout());
        
        this.label = new JLabel("0");
        container.add(this.label, BorderLayout.NORTH);
        
        this.button = new JButton("Click!");
        container.add(this.button, BorderLayout.SOUTH);
        
        button.addActionListener(new ClickListener(this.calculator, this.label));
    }

    public JFrame getFrame() {
        return frame;
    }
}
