import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/*
 * @author Timdpr
 */

public class ButtonListener implements ActionListener {
    private JButton plusButton;
    private JButton minusButton;
    private JButton zButton;
    private JTextField inputField;
    private JTextField outputField;
    private ApplicationLogic calculator = new ApplicationLogic();
    
    public ButtonListener(JButton plusButton, JButton minusButton, JButton zButton,
                          JTextField inputField, JTextField outputField) {
        this.plusButton = plusButton;
        this.minusButton = minusButton;
        this.zButton = zButton;
        this.inputField = inputField;
        this.outputField = outputField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int input = 0;
        try {
            input = Integer.parseInt(this.inputField.getText());
        } catch (Exception ex) {    
        }
            
        if (e.getSource() == this.plusButton) {
            this.calculator.plus(input);
        } else if (e.getSource() == this.minusButton) {
            this.calculator.minus(input);
        } else {
            this.calculator.reset();
        }
        
        this.outputField.setText("" + this.calculator.result());
        this.inputField.setText("");
        setZButton();
    }
    
    public void setZButton() {
        if (this.calculator.result() == 0) {
            this.zButton.setEnabled(false);
        } else {
            this.zButton.setEnabled(true);
        }
    }
}
