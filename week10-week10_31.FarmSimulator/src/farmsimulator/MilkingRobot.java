/*
 * @author Timdpr
 */
package farmsimulator;

public class MilkingRobot {
    private BulkTank bulkTank = null;
    
    public MilkingRobot() {
        
    }
    
    public BulkTank getBulkTank() {
        return this.bulkTank;
    }
    
    public void setBulkTank(BulkTank tank) {
        this.bulkTank = tank;
    }
    
    public void milk(Milkable milkable) {
        if (getBulkTank() == null) {
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        } else {
            bulkTank.addToTank(milkable.milk());
        }
    }
}
