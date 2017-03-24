public class Calculator {
    private Reader reader;
    private int counter;
    
    public void Calculator() {
        this.reader = new Reader();
        this.counter = 0;
    }
    
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }
            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }
        statistics();
    }
    
    private void sum() {
        int[] values = readValues();
        int answer = values[0] + values[1];
        System.out.println("product of the values " + answer);
    }
    
    private void difference() {
        int[] values = readValues();
        int answer = values[0] - values[1];
        System.out.println("product of the values " + answer);
    }
    
    private void product() {
        int[] values = readValues();
        int answer = values[0] * values[1];
        System.out.println("product of the values " + answer);
    }
    
    private int[] readValues() {
        int[] values = new int[2];
        System.out.print("value1: ");
        values[0] = reader.readInteger();
        System.out.print("value2: ");
        values[1] = reader.readInteger();
        
        this.counter++;
        return values;
    }
    
    private void statistics() {
        System.out.println("Calculations done " + counter);
    }
}