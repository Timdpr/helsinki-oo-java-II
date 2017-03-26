import java.util.ArrayList;
import java.util.HashMap;

/*
 * @author Timdpr
 */

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;
    
    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate, String>();
    }
    
    public boolean add(RegistrationPlate plate, String owner) {
        return owners.putIfAbsent(plate, owner) == null;
    }
    
    public String get(RegistrationPlate plate) {
        return owners.get(plate);
    }
    
    public boolean delete(RegistrationPlate plate) {
        return owners.remove(plate) != null;
    }
    
    public void printRegistrationPlates() {
        for (RegistrationPlate plate : owners.keySet()) {
            System.out.println(plate);
        }
    }
    
    public void printOwners() {
        ArrayList<String> ownerList = new ArrayList<String>();
        
        for (String owner : owners.values()) {
            if (!ownerList.contains(owner)) {
                ownerList.add(owner);
                System.out.println(owner);
            }
        }
    }
}
