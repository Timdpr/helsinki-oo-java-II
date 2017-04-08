package file;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        File file = new File("src/testfile.txt");
        try {
            Analysis analysis = new Analysis(file);
            System.out.println("Lines: " + analysis.lines());
            System.out.println("Characters: " + analysis.characters());
            
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
    }
}
