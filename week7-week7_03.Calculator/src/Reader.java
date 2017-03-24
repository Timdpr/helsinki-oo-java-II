import java.util.Scanner;

public class Reader {
    private Scanner reader;
    
    public Reader() {
        this.reader = new Scanner(System.in);
    }
    
    public String readString() {
        String temp = this.reader.nextLine();
        return temp;
    }
    
    public int readInteger() {
        String temp = this.reader.nextLine();
        return Integer.parseInt(temp);
    }
}