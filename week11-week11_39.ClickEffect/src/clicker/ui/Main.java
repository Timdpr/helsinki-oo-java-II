package clicker.ui;

import clicker.applicationlogic.PersonalCalculator;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        PersonalCalculator calculator = new PersonalCalculator();
        UserInterface ui = new UserInterface(calculator);
        SwingUtilities.invokeLater(ui);
    }
}
