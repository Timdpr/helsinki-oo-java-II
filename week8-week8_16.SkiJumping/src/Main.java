import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        TextUI ui = new TextUI(reader);
        ui.start();
    }
}
