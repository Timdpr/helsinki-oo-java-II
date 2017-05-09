/*
 * @author Timdpr
 */
package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MindfulDictionary {
    private Map<String, String> dict;
    private File file;
    private Scanner reader;
    
    public MindfulDictionary() {
        this.dict = new HashMap<String, String>();
    }
    
    public MindfulDictionary(String file) {
        this.dict = new HashMap<String, String>();
        this.file = new File(file);
        try {
            this.reader = new Scanner(this.file);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
    }
    
    public boolean load() {
        if (!this.reader.hasNextLine()) {
            return false;
        }
        while (this.reader.hasNextLine()) {
            String[] parts = reader.nextLine().split(":");
            add(parts[0], parts[1]);
        }
        return true;
    }
    
    public boolean save() {
        try {
            FileWriter writer = new FileWriter(this.file);
            for (String key : this.dict.keySet()) {
                writer.write(key + ":" + this.dict.get(key) + "\n");
            }
            writer.close();
            return true;
            
        } catch (IOException e) {
            return false;
        }
    }
    
    public void add(String word, String translation) {
        if (!this.dict.containsKey(word)) {
            this.dict.put(word, translation);
        }
    }
    
    public String translate(String word) {
        if (this.dict.containsKey(word)) {
            return this.dict.get(word);
            
        } else if (this.dict.containsValue(word)) {
            return getKeyByValue(this.dict, word);
        }
        return null;
    }
    
    public void remove(String word) {
        this.dict.remove(word);
        String key = getKeyByValue(this.dict, word);
        this.dict.remove(key);
    }
    
    public <T, E> T getKeyByValue(Map<T, E> map, E value) {
        for (Map.Entry<T, E> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}
