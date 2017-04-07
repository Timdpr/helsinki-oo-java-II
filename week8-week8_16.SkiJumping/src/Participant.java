import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*
 * @author Timdpr
 */

public class Participant implements Comparable<Participant> {
    private String name;
    private int points = 0;
    private List<Integer> jumpLengths = new ArrayList<Integer>();
    private Random random = new Random();
    
    public Participant(String name) {
        this.name = name;
    }
    
    public void jump() {
        ArrayList<Integer> scores = getScores();
        int length = randInt(60, 120);
        
        // Print length and scores:
        System.out.println("  " + this.getName());
        System.out.println("    length: " + length);
        System.out.println("    judge votes: " + scores);
        
        // Calculate total score:
        int roundPoints = length;
        Collections.sort(scores);
        for (int i = 1; i < 4; i++) {
            roundPoints += scores.get(i);
        }
        
        this.points += roundPoints;
        this.jumpLengths.add(length);
    }
    
    public ArrayList<Integer> getScores() {
        ArrayList<Integer> scores = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            scores.add(randInt(10, 20));
        }
        return scores;
    }
    
    public int getPoints() {
        return this.points;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getJumpLengthsString() {
        String returnString = "";
        for (int jump : this.jumpLengths) {
            returnString += " " + jump + " m,";
        }
        return returnString.substring(0, returnString.length()-1);
    }
    
    public int randInt(int min, int max) {
        int randomNum = this.random.nextInt((max - min) + 1) + min;
        return randomNum;
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.getPoints() + " points)";
    }
    
    @Override
    public int compareTo(Participant participant) {
        return this.getPoints() - participant.getPoints();
    }
}
