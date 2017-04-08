/*
 * @author Timdpr
 */
package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {
    private File file;
    private ArrayList<String> wordList = new ArrayList<String>();
    
    public WordInspection(File file) throws FileNotFoundException {
        this.file = file;
        
        Scanner reader = new Scanner(file, "UTF-8");
        while (reader.hasNextLine()) {
            this.wordList.add(reader.nextLine());
        }
    }
    
    public int wordCount() {
        return this.wordList.size();
    }
    
    public List<String> wordsContainingZ() {
        List<String> words = new ArrayList<String>();
        
        for (String word : this.wordList) {
            if (word.contains("z")) {
                words.add(word);
            }
        }
        return words;
    }
    
    public List<String> wordsEndingInL() {
        List<String> words = new ArrayList<String>();
        
        for (String word : this.wordList) {
            if (word.endsWith("l")) {
                words.add(word);
            }
        }
        return words;
    }
    
    public List<String> palindromes() {
        List<String> words = new ArrayList<String>();
        
        for (String word : this.wordList) {
            if (this.isPalindrome(word)) { // Faster way than using reverse
                words.add(word);
            }       
        }
        return words;
    }
    
    private boolean isPalindrome(String str) {    
        int n = str.length();
        for( int i = 0; i < n/2; i++ ) {
            if (str.charAt(i) != str.charAt(n-i-1)) {
                return false;
            }
        }    
        return true;    
    }
    
    public List<String> wordsWhichContainAllVowels() {
        List<String> words = new ArrayList<String>();
         
        for (String word : this.wordList) {
            if (this.isAllVowels(word)) {
                words.add(word);
            }
        }
        return words;
    }
    
    private boolean isAllVowels(String word) {
        String vowels = "aeiouyäö";
        
        for (char vowel : vowels.toCharArray()) {
            if (!word.contains("" + vowel)) {
                return false;
            }
        }
        return true;
    }
}
