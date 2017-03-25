import java.util.ArrayList;
import java.util.HashMap;

/*
 * @author Timdpr
 */

public class Dictionary {
    private HashMap<String, String> dictMap = new HashMap<String, String>();
    
    public String translate(String word) {
        return this.dictMap.get(word);
    }
    
    public void add(String word, String translation) {
        this.dictMap.put(word, translation);
    }
    
    public int amountOfWords() {
        return this.dictMap.size();
    }
    
    public ArrayList<String> translationList() {
        ArrayList<String> translationList = new ArrayList<String>();
        for (String key : this.dictMap.keySet()) {
            translationList.add(key + " = " + this.dictMap.get(key));
        }
        return translationList;
    }
}