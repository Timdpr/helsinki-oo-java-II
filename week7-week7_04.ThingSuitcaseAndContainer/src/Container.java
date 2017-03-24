import java.util.ArrayList;

/*
 * @author Timdpr
 */

public class Container {
    
    private int weightLimit;
    private ArrayList<Suitcase> suitcases;

    public Container(int weightLimit) {
        this.weightLimit = weightLimit;
        this.suitcases = new ArrayList<Suitcase>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if ((this.totalWeight() + suitcase.totalWeight()) <= weightLimit) {
            this.suitcases.add(suitcase);
        }
    }
    
    public int totalWeight() {
        int weight = 0;
        for (Suitcase s : this.suitcases) {
            weight += s.totalWeight();
        }
        return weight;
    }
    
    public void printThings() {
        for (Suitcase s : this.suitcases) {
            s.printThings();
        }
    }
    
    @Override
    public String toString() {
        if (this.suitcases.isEmpty()) {
            return "empty (0 kg)";
            
        } else if (this.suitcases.size() == 1) {
            return "1 suitcase (" + this.totalWeight() + " kg)";
            
        } else {
            return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
        }      
    }
}