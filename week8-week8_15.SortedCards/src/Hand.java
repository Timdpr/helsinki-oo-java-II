import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * @author Timdpr
 */

public class Hand implements Comparable<Hand> {
    private List<Card> hand = new ArrayList<Card>();
    
    public void add(Card card) {
        this.hand.add(card);
    }
    
    public void print() {
        for (Card card : this.hand) {
            System.out.println(card);
        }
    }
    
    public void sort() {
        Collections.sort(this.hand);
    }
    
    public int getHandValue() {
        int value = 0;
        for (Card card : this.hand) {
            value += card.getValue();
        }
        return value;
    }
    
    public void sortAgainstSuit() {
        Collections.sort(this.hand, new SortAgainstSuitAndValue());
    }

    @Override
    public int compareTo(Hand o) {
        return this.getHandValue() - o.getHandValue();
    }
}
