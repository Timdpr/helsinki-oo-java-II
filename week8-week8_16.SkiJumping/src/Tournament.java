import java.util.ArrayList;
import java.util.Collections;

/*
 * @author Timdpr
 */

public class Tournament {
    private int roundNumber = 1;
    private ArrayList<Participant> participants = new ArrayList<Participant>();
    
    public void addParticipant(Participant p) {
        this.participants.add(p);
    }
    
    public void playRound() {
        int counter = 1;
        System.out.println("Round " + this.roundNumber + "\n");
        
        System.out.println("Jumping order:");
        Collections.sort(this.participants);
        for (Participant p : this.participants) {
            System.out.println("  " + counter + ". " + p);
            counter++;
        }
        System.out.println("\nResults of round " + this.roundNumber);
        for (Participant p : this.participants) {
            p.jump();
        }
        System.out.println("");
        
        this.roundNumber++;
    }
    
    public void printTournamentResults() {
        Collections.sort(this.participants);
        Collections.reverse(this.participants);
        int counter = 0;
        
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        for (Participant p : this.participants) {
            System.out.println((counter+1) + "           " + this.participants.get(counter));
            System.out.println("            jump lengths:" + p.getJumpLengthsString());
            counter++;
        }
    }
}
