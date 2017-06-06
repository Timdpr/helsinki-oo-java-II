import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;
    private JTextField outputField;
    private JTextField inputField;
    private JButton plus;
    private JButton minus;
    private JButton z;

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(300, 150));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new GridLayout(3,1));
        
        outputField = new JTextField("0");
        outputField.setEnabled(false);
        container.add(outputField);
        
        inputField = new JTextField();
        container.add(inputField);
        
        JPanel lowerPanel = new JPanel();
        lowerPanel.setLayout(new GridLayout(1,3));
        
        this.plus = new JButton("+");
        this.minus = new JButton("-");
        this.z = new JButton("Z");
        this.z.setEnabled(false);
        
        lowerPanel.add(this.plus);
        lowerPanel.add(this.minus);
        lowerPanel.add(this.z);
        container.add(lowerPanel);
        
        this.plus.addActionListener(
                new ButtonListener(this.plus, this.z, this.inputField, this.outputField));
        this.minus.addActionListener(
                new ButtonListener(this.minus, this.z, this.inputField, this.outputField));
        this.z.addActionListener(
                new ButtonListener(this.z, this.z, this.inputField, this.outputField));
    }

    public JFrame getFrame() {
        return frame;
    }
}
