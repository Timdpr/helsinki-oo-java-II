import java.util.ArrayList;

/*
 * @author Timdpr
 */

public class Container {
    private int weightLimit;
    private ArrayList<Suitcase> suitcases = new ArrayList<Suitcase>();

    public Container(int weightLimit) {
        this.weightLimit = weightLimit;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if ((totalWeight() + suitcase.totalWeight()) <= weightLimit) {
            suitcases.add(suitcase);
        }
    }
    
    public int totalWeight() {
        int total = 0;
        for (Suitcase s : suitcases) {
            total += s.totalWeight();
        }
        return total;
    }
    
    public void printThings() {
        for (Suitcase s : suitcases) {
            s.printThings();
        }
    }
    
    @Override
    public String toString() {
        if (suitcases.isEmpty()) {
            return "empty (0 kg)";
        } else if (suitcases.size() == 1) {
            return "1 suitcase (" + totalWeight() + " kg)";
        } else {
            return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
        }      
    }
}