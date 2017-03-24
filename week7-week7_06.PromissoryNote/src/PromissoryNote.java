import java.util.HashMap;

/*
 * @author Timdpr
 */ 

public class PromissoryNote {
    private HashMap<String, Double> loanList;
    
    public PromissoryNote() {
        this.loanList = new HashMap<String, Double>();
    }
    
    public void setLoan(String toWhom, double value) {
        this.loanList.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whose) {
        /* Slower:
        if (this.loanList.containsKey(whose)) {
            return this.loanList.get(whose);
        }
        return 0;
        */
        
        Double value = this.loanList.get(whose);
        if (value == null) {
            return 0;
        }
        return value;
    }
}