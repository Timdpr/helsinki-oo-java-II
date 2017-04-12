import ui.TextUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        TextUI textUI = new TextUI(reader);
        textUI.start();
    }
}
