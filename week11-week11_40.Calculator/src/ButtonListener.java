import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/*
 * @author Timdpr
 */

public class ButtonListener implements ActionListener {
    private JButton pressedButton;
    private JButton zButton;
    private JTextField inputField;
    private JTextField outputField;
    
    public ButtonListener(JButton pressedButton, JButton zButton,
                          JTextField inputField, JTextField outputField) {
        this.pressedButton = pressedButton;
        this.zButton = zButton;
        this.inputField = inputField;
        this.outputField = outputField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String operation = this.pressedButton.getText();
        
        if (operation.equals("Z")) {
            this.outputField.setText("0");
        }
        else if (this.inputField.getText().matches("\\d+")) {
            
            int input = Integer.parseInt(this.inputField.getText());
            int output = Integer.parseInt(this.outputField.getText());

            switch (operation) {
            case "+": this.outputField.setText("" + (output + input));
                      break;
            case "-": this.outputField.setText("" + (output - input));
                      break;
            }
        }
        setZButton();
        this.inputField.setText("");
    }
    
    public void setZButton() {
        if (this.outputField.getText().equals("0")) {
            this.zButton.setEnabled(false);
        } else {
            this.zButton.setEnabled(true);
        }
    }
}
