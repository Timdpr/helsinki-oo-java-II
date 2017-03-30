import java.util.ArrayList;

public class Changer {
    private final ArrayList<Change> changeList = new ArrayList<Change>();
    
    public void addChange(Change change) {
        changeList.add(change);
    }
    
    public String change(String characterString) {
        for (Change ch : changeList) {
            characterString = ch.change(characterString);
        }
        return characterString;
    }
}

