/*
 * @author Timdpr
 */
package boxes;

import java.util.ArrayList;
import java.util.List;

public class MaxWeightBox extends Box {
    
    private int maxWeight;
    private List<Thing> things;
    
    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }
    
    public int getTotalWeight() {
        int totalWeight = 0;
        for (Thing thing : things) {
            totalWeight += thing.getWeight();
        }
        return totalWeight;
    }
    
    @Override
    public void add(Thing thing) {
        if (!(thing.getWeight() + getTotalWeight() > this.maxWeight)) {
            this.things.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return this.things.contains(thing);
    }
}
