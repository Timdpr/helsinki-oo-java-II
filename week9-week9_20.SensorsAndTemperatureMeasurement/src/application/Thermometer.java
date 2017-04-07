/*
 * @author Timdpr
 */
package application;

import java.util.Random;

public class Thermometer implements Sensor {
    private boolean isOn = false;
    private Random random = new Random();

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void on() {
        this.isOn = true;
    }

    @Override
    public void off() {
        this.isOn = false;
    }

    @Override
    public int measure() {
        if (isOn) {
            return random.nextInt(60) - 30;
        }
        throw new IllegalStateException("Thermometer is off");
    }
}
