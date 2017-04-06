import java.util.Comparator;

/*
 * @author Timdpr
 */

public class SortAgainstSuitAndValue implements Comparator<Card> {

    @Override
    public int compare(Card card1, Card card2) {
        int answer = card1.getSuit() - card2.getSuit();
        if (answer == 0) {
            return card1.getValue()- card2.getValue();
        }
        return answer;
    }
}
