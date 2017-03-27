/*
 * @author Timdpr
 */

public class CD implements ToBeStored {
    private final double weight = 0.1;
    private String artist;
    private String title;
    private int publishingYear;
    
    public CD(String artist, String title, int publishingYear) {
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
    }
    
    @Override
    public double weight() {
        return this.weight;
    }
    
    @Override
    public String toString() {
        return this.artist + ": " + this.title + " (" + this.publishingYear + ")";
    }
}
