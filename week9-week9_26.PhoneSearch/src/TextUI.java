/*
 * @author Timdpr
 * Uses JDK 8
 */

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TextUI {
    private Scanner reader;
    private PersonDirectory directory = new PersonDirectory();
    
    public TextUI(Scanner reader) {
        this.reader = reader;
    }
    
    public void start() {
        System.out.println("phone search\n" +
                           "available operations:\n" +
                           " 1 add a number\n" +
                           " 2 search for a number\n" +
                           " 3 search for a person by phone number\n" +
                           " 4 add an address\n" +
                           " 5 search for personal information\n" +
                           " 6 delete personal information\n" +
                           " 7 filtered listing\n" +
                           " x quit\n");
        askForCommand();
    }
    
    public void askForCommand() {
        String command;
        while (true) {
            System.out.print("command: ");
            command = this.reader.nextLine();
            if (command.length() > 1) {
                continue;
            }
            switch (command) {
                case "1": addNumber();
                          continue;
                case "2": searchNumber();
                          continue;
                case "3": searchPersonByNumber();
                          continue;
                case "4": addAddress();
                          continue;
                case "5": searchPersonalInfo();
                          continue;
                case "6": deletePersonalInfo();
                          continue;
                case "7": filteredListing();
                          continue;
            }
            if (command.equals("x")) {
                break;
            }
        }
    }
    
    public void addNumber() {
        System.out.print("whose number: ");
        String name = this.reader.nextLine();
        System.out.println("number: ");
        String number = this.reader.nextLine();
        
        this.directory.addNumber(name, number);
    }

    private void searchNumber() {
        System.out.print("whose number: ");
        String name = this.reader.nextLine();
        
        if (this.directory.containsPersonByName(name)) {
            this.directory.getPersonByName(name).printNumbers();
        } else {
            System.out.println("  not found");
        }
    }

    private void searchPersonByNumber() {
        System.out.println("number: ");
        String number = this.reader.nextLine();

        System.out.println(" " + this.directory.getNameByNumber(number));
    }

    private void addAddress() {
        System.out.println("whose address: ");
        String name = this.reader.nextLine();
        System.out.println("street: ");
        String street = this.reader.nextLine();
        System.out.println("city ");
        String city = this.reader.nextLine();
        
        this.directory.addAddress(name, street, city);
    }

    private void searchPersonalInfo() {
        System.out.println("whose information: ");
        String name = this.reader.nextLine();
        
        if (this.directory.containsPersonByName(name)) {
            this.directory.getPersonByName(name).printDetails();
        } else {
            System.out.println("  not found");
        }
    }

    private void deletePersonalInfo() {
        System.out.println("whose information: ");
        String name = this.reader.nextLine();
        
        if (this.directory.containsPersonByName(name)) {
            this.directory.deleteInfoByName(name);
        } else {
            System.out.println(" not found");
        }
    }

    private void filteredListing() {
        System.out.println("keyword (if empty, all listed): ");
        String keyword = this.reader.nextLine();
        
        List<Person> personList = this.directory.searchPersonByKeyword(keyword);
        Collections.sort(personList);
        
        if (personList.isEmpty()) {
            System.out.println(" not found");
        } else {
            for (Person p : personList) {
                p.printNameAndDetails();
            }
        }
    }
}
