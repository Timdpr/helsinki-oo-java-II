/*
 * @author Timdpr
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RingingCentre {
    
    private Map<Bird, ArrayList<String>> placeMap = new HashMap<Bird, ArrayList<String>>();
    
    public void observe(Bird bird, String place) {
        if (!this.placeMap.containsKey(bird)) {
            this.placeMap.put(bird, new ArrayList<String>());
        }
        this.placeMap.get(bird).add(place);
    }
    
    public void observations(Bird bird) {
        if (this.placeMap.get(bird) == null) {
            System.out.println(bird + " observations: 0");
        } else {
            int obsNum = this.placeMap.get(bird).size();
            System.out.println(bird + " observations: " + obsNum);
            for (int i = 0; i < obsNum; i++) {
                System.out.println(placeMap.get(bird).get(i));
            }
        }
    }
}
