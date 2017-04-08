package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        // test your code here
        try {
            File file = new File("src/shortList.txt");
            // all words are in file src/wordList.txt
            WordInspection wi = new WordInspection(file);
            
            System.out.println(wi.wordCount());
            System.out.println(wi.wordsContainingZ());
            System.out.println(wi.wordsEndingInL());
            System.out.println(wi.palindromes());
            System.out.println(wi.wordsWhichContainAllVowels());
            
        } catch (FileNotFoundException e) {
            
        }
    }
}
