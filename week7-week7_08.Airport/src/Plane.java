/*
 * @author Timdpr
 */

public class Plane {
    private String id;
    private int capacity;
    
    public Plane(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }
    
    public String getId() {
        return this.id;
    }
    
    @Override
    public String toString() {
        return id + " (" + capacity + " ppl)";
    } 
}
