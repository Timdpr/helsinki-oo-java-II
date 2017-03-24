import java.util.ArrayList;

/*
 * @author Timdpr
 */

public class Suitcase {
    
    private ArrayList<Thing> things = new ArrayList<Thing>();
    private int weightLimit;
    
    public Suitcase(int weightLimit) {
        this.weightLimit = weightLimit;
    }
    
    public void addThing(Thing thing) {
        if ((totalWeight() + thing.getWeight()) <= weightLimit) {
            things.add(thing);
        }
    }
    
    public int totalWeight() {
        int total = 0;
        for (Thing t : things) {
            total += t.getWeight();
        }
        return total;
    }
    
    public void printThings() {
        for (Thing t : things) {
            System.out.println(t);
        }
    }
    
    public Thing heaviestThing() {
        int currentHeaviest = 0;
        Thing heaviest = null;
        
        for (Thing t : things) {
            if (t.getWeight() > currentHeaviest) {
                currentHeaviest = t.getWeight();
                heaviest = t;
            }
        }
        return heaviest;
    }
    
    @Override
    public String toString() {
        if (things.isEmpty()) {
            return "empty (0 kg)";
        } else if (things.size() == 1) {
            return "1 thing (" + totalWeight() + " kg)";
        } else {
            return things.size() + " things (" + totalWeight() + " kg)";
        }      
    }
}