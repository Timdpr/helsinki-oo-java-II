/*
 * @author Timdpr
 */
package noticeboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ActionEventListener implements ActionListener {

    private JTextField textField;
    private JLabel label;
    
    public ActionEventListener(JTextField origin, JLabel destination) {
        this.textField = origin;
        this.label = destination;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.label.setText(this.textField.getText());
        this.textField.setText("");
    }
}
