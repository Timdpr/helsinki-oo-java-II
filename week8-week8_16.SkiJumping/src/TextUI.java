import java.util.Scanner;

/*
 * @author Timdpr
 */

public class TextUI {
    private Scanner reader;
    private Tournament tournament;
    
    public TextUI(Scanner reader) {
        this.reader = reader;
    }
    
    public void start() {
        this.tournament = new Tournament();
        registerParticipants();
        playTournament();
    }
    
    public void registerParticipants() {
        String name = "name";
        System.out.println("Kumpula ski jumping week\n");
        System.out.println("Write the names of the participants one at a time; "
                + "an empty string brings you to the jumping phase.");
        
        while (true) {
            System.out.print("  Participant name: ");
            name = this.reader.nextLine();
            if (name.isEmpty()) {
                break;
            }
            this.tournament.addParticipant(new Participant(name));
        }
        System.out.println("");
    }
    
    public void playTournament() {
        System.out.println("The tournament begins!\n");
        String input = "";
        
        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            input = this.reader.nextLine();
            if (!input.equals("jump")) {
                System.out.println("\nThanks!\n");
                break;
            }
            System.out.println("");
            
            this.tournament.playRound();
            
        }
        this.tournament.printTournamentResults();
    }
}
