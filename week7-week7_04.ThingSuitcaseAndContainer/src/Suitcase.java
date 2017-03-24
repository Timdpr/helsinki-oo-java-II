import java.util.ArrayList;

/*
 * @author Timdpr
 */

public class Suitcase {
    
    private int weightLimit;
    private ArrayList<Thing> things;
    
    public Suitcase(int weightLimit) {
        this.weightLimit = weightLimit;
        this.things = new ArrayList<Thing>();
    }
    
    public void addThing(Thing thing) {
        if ((this.totalWeight() + thing.getWeight()) <= this.weightLimit) {
            this.things.add(thing);
        }
    }
    
    public int totalWeight() {
        int weight = 0;
        for (Thing t : this.things) {
            weight += t.getWeight();
        }
        return weight;
    }
    
    public void printThings() {
        for (Thing t : this.things) {
            System.out.println(t);
        }
    }
    
    public Thing heaviestThing() {
        Thing heaviest = null;
        
        for (Thing t : this.things) {
            if (heaviest == null || heaviest.getWeight() < t.getWeight()) {
                heaviest = t;
            }
        }
        return heaviest;
    }
    
    @Override
    public String toString() {
        if (this.things.isEmpty()) {
            return "empty (0 kg)";
            
        } else if (this.things.size() == 1) {
            return "1 thing (" + this.totalWeight() + " kg)";
            
        } else {
            return this.things.size() + " things (" + this.totalWeight() + " kg)";
        }      
    }
}