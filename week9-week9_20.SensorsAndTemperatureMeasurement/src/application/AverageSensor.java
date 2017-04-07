/*
 * @author Timdpr
 */
package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Sensor> sensors= new ArrayList<Sensor>();
    private List<Integer> readings= new ArrayList<Integer>();
    
    public void addSensor(Sensor additional) {
        this.sensors.add(additional);
    }
    
    public List<Integer> readings() {
        return this.readings;
    }

    @Override
    public boolean isOn() {
        for (Sensor s : this.sensors) {
            if (!s.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for (Sensor s : this.sensors) {
            s.on();
        }
    }

    @Override
    public void off() {
        for (Sensor s : this.sensors) {
            s.off();
        }
    }

    @Override
    public int measure() {
        if (this.isOn() && !this.sensors.isEmpty()) {
            int total = 0;
            int totalValue = 0;
            
            for (Sensor s : this.sensors) {
                if (s.isOn()) {
                    totalValue += s.measure();
                    total++;
                }
            }
            int average = totalValue / total;
            this.readings.add(average);
            return average;
        }
        throw new IllegalStateException("All sensors are off");
    }
}
