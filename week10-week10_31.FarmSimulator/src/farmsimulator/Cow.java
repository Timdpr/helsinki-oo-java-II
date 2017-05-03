/*
 * @author Timdpr
 */
package farmsimulator;

import java.util.Random;

public class Cow implements Milkable, Alive {
    private String name;
    private Random random = new Random();
    private double udderCapacity;
    private double udderAmount = 0;
    private static final String[] NAMES = new String[] {
    "Anu", "Arpa", "Essi", "Heluna", "Hely", "Hento", "Hilke", "Hilsu", "Hymy",
    "Ihq", "Ilme", "Ilo", "Jaana", "Jami", "Jatta", "Laku", "Liekki",
    "Mainikki", "Mella", "Mimmi", "Naatti", "Nina", "Nyytti", "Papu",
    "Pullukka", "Pulu", "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    
    
    public Cow() {
        this.name = NAMES[random.nextInt(NAMES.length)];
        this.udderCapacity = random.nextInt(25) + 16;
    }
    
    public Cow(String name) {
        this.name = name;
        this.udderCapacity = random.nextInt(25) + 16;
    }
    
    public String getName() {
        return this.name;
    }
    
    public double getCapacity() {
        return this.udderCapacity;
    }
    
    public double getAmount() {
        return this.udderAmount;
    }
    
    @Override
    public String toString() {
        return this.name + " " + Math.ceil(this.udderAmount) + "/" + Math.ceil(this.udderCapacity);
    }

    @Override
    public double milk() {
        double ret = this.udderAmount;
        this.udderAmount = 0;
        return ret;
    }

    @Override
    public void liveHour() {
        double amount = (1.3 * random.nextDouble()) + 0.7;
        if (this.udderAmount + amount <= this.udderCapacity) {
            this.udderAmount += amount;
        } else {
            this.udderAmount = this.udderCapacity;
        }
    }
}
