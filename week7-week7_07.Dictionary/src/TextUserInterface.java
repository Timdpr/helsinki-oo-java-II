import java.util.Scanner;

/*
 * @author Timdpr
 */

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }
    
    public void start() {
        System.out.println("Statements:\n"
                + "  add - adds a word pair to the dictionary\n"
                + "  translate - asks a word and prints its translation\n"
                + "  quit - quits the text user interface");
        handleInput();
    }
    
    public void handleInput() {
        String statement;
        while (true) {
            System.out.print("\nStatement: ");
            statement = this.reader.nextLine();
            
            if (statement.equals("quit")) {
                System.out.println("Cheers!");
                break;
                
            } else if (statement.equals("add")) {
                add();
                
            } else if (statement.equals("translate")) {
                translate();
                
            } else {
                System.out.println("Unknown statement");
            }
        }
    }
    
    public void add() {
        System.out.print("In Finnish: ");
        String finnishWord = this.reader.nextLine();
        System.out.print("Translation: ");
        String englishWord = this.reader.nextLine();
        
        this.dictionary.add(finnishWord, englishWord);
    }
    
    public void translate() {
        System.out.print("Give a word: ");
        String word = this.reader.nextLine();
        
        if (this.dictionary.translate(word) == null) {
            System.out.println("Unknown word!");
        } else {
            System.out.println("Translation: " + dictionary.translate(word));
        }
    }
}