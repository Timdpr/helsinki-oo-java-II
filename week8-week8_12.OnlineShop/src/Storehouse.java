import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * @author Timdpr
 */

public class Storehouse {
    private Map<String, Integer> priceMap = new HashMap<String, Integer>();
    private Map<String, Integer> stockMap = new HashMap<String, Integer>();
    
    public void addProduct(String product, int price, int stock) {
        this.priceMap.put(product, price);
        this.stockMap.put(product, stock);
    }
    
    public Set<String> products() {
        return this.priceMap.keySet();
    }
    
    public boolean take(String product) {
        if (this.stockMap.containsKey(product) && this.stock(product) > 0) {
            this.stockMap.replace(product, this.stock(product) - 1);
            return true;
        }
        return false;
    }
    
    public int price(String product) {
        if (this.priceMap.containsKey(product)) {
            return this.priceMap.get(product);
        }
        return -99;
    }
    
    public int stock(String product) {
        if (this.stockMap.containsKey(product)) {
            return this.stockMap.get(product);
        }
        return 0;
    }
}
