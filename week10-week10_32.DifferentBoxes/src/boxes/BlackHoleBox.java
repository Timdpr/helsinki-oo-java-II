/*
 * @author Timdpr
 */
package boxes;

public class BlackHoleBox extends Box {

    @Override
    public void add(Thing thing) {
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    } 
}
