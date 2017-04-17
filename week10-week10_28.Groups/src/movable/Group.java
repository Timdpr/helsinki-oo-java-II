/*
 * @author Timdpr
 */
package movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {
    private List<Movable> movableList = new ArrayList<Movable>();
    
    public void addToGroup(Movable movable) {
        this.movableList.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Movable movable : this.movableList) {
            movable.move(dx, dy);
        }
    }
    
    @Override
    public String toString() {
        String returnString = "";
        for (Movable movable : this.movableList) {
            returnString += movable;
            returnString += "\n";
        }
        return returnString;
    }
}
