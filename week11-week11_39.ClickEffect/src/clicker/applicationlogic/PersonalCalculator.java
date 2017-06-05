/*
 * @author Timdpr
 */
package clicker.applicationlogic;

public class PersonalCalculator implements Calculator {
    private int value = 0;

    @Override
    public int giveValue() {
        return this.value;
    }

    @Override
    public void increase() {
        this.value++;
    }
}
