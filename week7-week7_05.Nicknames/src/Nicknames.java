import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        HashMap nameMap = new HashMap<String, String>();
        nameMap.put("matti", "mage");
        nameMap.put("mikael", "mixu");
        nameMap.put("arto", "arppa");
        
        System.out.println(nameMap.get("mikael"));
    }
}