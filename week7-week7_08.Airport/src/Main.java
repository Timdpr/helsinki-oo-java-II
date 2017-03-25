import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        AirportDatabase airportDatabase = new AirportDatabase();
        
        TextUI panel = new TextUI(reader, airportDatabase);
        panel.start();
    }
}
