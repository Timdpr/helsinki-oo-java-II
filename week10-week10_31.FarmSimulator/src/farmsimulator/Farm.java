/*
 * @author Timdpr
 */
package farmsimulator;

import java.util.ArrayList;
import java.util.List;

public class Farm implements Alive {
    private String owner;
    private Barn barn;
    private List<Cow> cows = new ArrayList<Cow>();
    
    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
    }
    
    public void addCow(Cow cow) {
        this.cows.add(cow);
    }
    
    public void manageCows() {
        this.barn.takeCareOf(cows);
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.barn.installMilkingRobot(milkingRobot);
    }
    
    public String getOwner() {
        return this.owner;
    }
    
    public String cowListString() {
        if (this.cows.isEmpty()) {
            return "No cows.";
        }
        String ret = "Animals:";
        for (Cow cow : this.cows) {
            ret += "\n        " + cow;
        }
        return ret;
    }

    @Override
    public void liveHour() {
        if (!this.cows.isEmpty()) {
            for (Cow cow : this.cows) {
                cow.liveHour();
            }
        }
    }
    
    @Override
    public String toString() {
        return "Farm owner: " + getOwner() + "\nBarn bulk tank: " + this.barn +
               "\n" + cowListString();
    }
}
