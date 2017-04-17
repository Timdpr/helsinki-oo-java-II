/*
 * @author Timdpr
 */
package people;

public class Student extends Person {
    private int credits = 0;

    public Student(String name, String address) {
        super(name, address);
    }
    
    public void study() {
        this.credits++;
    }
    
    public int credits() {
        return this.credits;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n  credits " + this.credits;
    }
}
