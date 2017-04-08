/*
 * @author Timdpr
 */
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Analysis {
    private File file;
    private ArrayList<String> fileLineList = new ArrayList<String>();
    
    public Analysis(File file) throws FileNotFoundException {
        this.file = file;
        
        Scanner reader = new Scanner(file);
        while (reader.hasNextLine()) {
            this.fileLineList.add(reader.nextLine());
        }
    }
    
    public int lines() {
        return this.fileLineList.size();
    }
    
    public int characters() {
        int chars = this.lines(); // Includes newlines as characters
        for (String line : this.fileLineList) {
            chars += line.length();
        }
        return chars;
    }
}
