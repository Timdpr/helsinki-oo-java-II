import java.util.ArrayList;

/*
 * @author Timdpr
 */

public class AirportDatabase {
    private ArrayList<Plane> planes = new ArrayList<Plane>();
    private ArrayList<Flight> flights = new ArrayList<Flight>();
    
    public void addPlane(String id, String capacity) {
        Plane plane = new Plane(id, Integer.parseInt(capacity));
        planes.add(plane);
    }
    
    public void addFlight(String id, String departureCode, String destinationCode) {
        Plane plane = searchPlanesById(id);
        Flight flight = new Flight(plane, departureCode, destinationCode);
        flights.add(flight);
    }
    
    public void printPlanes() {
        for (Plane plane : planes) {
            System.out.println(plane);
        }
    }
    
    public void printFlights() {
        for (Flight flight: flights) {
            System.out.println(flight);
        }
    }
    
    public Plane searchPlanesById(String id) {
        for (Plane plane : planes) {
            if (plane.getId().equals(id)) {
                return plane;
            }
        }
        return null;
    }
}
