import java.util.Scanner;

/*
 * @author Timdpr
 */

public class TextUI {
    private Scanner reader;
    private AirportDatabase airportDatabase;
    
    public TextUI(Scanner reader, AirportDatabase airportDatabase) {
        this.reader = reader;
        this.airportDatabase = airportDatabase;
    }
    
    public void start() {
        airportPanel();
        flightService();
    }

    private void airportPanel() {
        System.out.println("Airport panel\n--------------------\n");
        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print("> ");
            String operation = this.reader.nextLine();
        
            if (operation.equals("x")) {
                break;
                
            } else if (operation.equals("1")) {
                System.out.print("Give plane ID: ");
                String id = this.reader.nextLine();
                System.out.print("Give plane capacity: ");
                String capacity = this.reader.nextLine();
                
                this.airportDatabase.addPlane(id, capacity);
                
            } else if (operation.equals("2")) {
                System.out.print("Give plane ID: ");
                String id = this.reader.nextLine();
                System.out.print("Give departure airport code: ");
                String departureCode = this.reader.nextLine();
                System.out.print("Give destination airport code: ");
                String destinationCode = this.reader.nextLine();
                
                this.airportDatabase.addFlight(id, departureCode, destinationCode);
            }           
        }
    }

    private void flightService() {
        System.out.println("\nFlight service\n------------\n");
        while (true) {    
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            System.out.print("> ");
            String operation = this.reader.nextLine();
            
            if (operation.equals("x")) {
                break;
                
            } else if (operation.equals("1")) {
                this.airportDatabase.printPlanes();
                
            } else if (operation.equals("2")) {
                this.airportDatabase.printFlights();
                
            } else if (operation.equals("3")) {
                System.out.print("Give plane ID: ");
                String id = this.reader.nextLine();
                
                System.out.println(this.airportDatabase.searchPlanesById(id));
            }
        }
    }
}
