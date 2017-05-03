/*
 * @author Timdpr
 */
package farmsimulator;

import java.util.Collection;

public class Barn {
    private BulkTank bulkTank;
    private MilkingRobot milkingRobot;
    
    public Barn(BulkTank tank) {
        this.bulkTank = tank;
    }
    
    public BulkTank getBulkTank() {
        return this.bulkTank;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.milkingRobot = milkingRobot;
        this.milkingRobot.setBulkTank(this.bulkTank);
    }
    
    public void takeCareOf(Cow cow) {
        if (this.milkingRobot == null) {
            throw new IllegalStateException("No milking robot is installed");
        }
        this.milkingRobot.milk(cow);
    }
    
    public void takeCareOf(Collection<Cow> cows) {
        if (this.milkingRobot == null) {
            throw new IllegalStateException("No milking robot is installed");
        }
        for (Cow cow : cows) {
            this.milkingRobot.milk(cow);
        }
    }
    
    @Override
    public String toString() {
        return bulkTank.toString();
    }
}
