import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        String input = "translate\n" + "apina\n" +
                "translate\n" + "juusto\n" +
                "add\n" + "juusto\n" + "cheese\n" +
                "translate\n" + "juusto\n" +
                "quit\n";
 
        Scanner reader = new Scanner(input);
        Dictionary dict = new Dictionary();
 
        TextUserInterface ui = new TextUserInterface(reader, dict);
        ui.start();
    }
}