/*
 * @author Timdpr
 */
package containers;

public class ProductContainerRecorder extends ProductContainer {
    private ContainerHistory containerHistory;
    
    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        super.addToTheContainer(initialVolume);
        this.containerHistory = new ContainerHistory();
        this.containerHistory.add(initialVolume);
    }
    
    public String history() {
        return this.containerHistory.toString();
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.history());
        System.out.println("Greatest product amount: " + this.containerHistory.maxValue());
        System.out.println("Smallest product amount: " + this.containerHistory.minValue());
        System.out.println("Average: " + this.containerHistory.average());
        System.out.println("Greatest change: " + this.containerHistory.greatestFluctuation());
        System.out.println("Variance: " + this.containerHistory.variance());
    }
    
    @Override
    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        this.containerHistory.add(super.getVolume());
    }
    
    @Override
    public double takeFromTheContainer(double amount) {
        this.containerHistory.add(super.getVolume() - amount);
        return super.takeFromTheContainer(amount);
    }
}
