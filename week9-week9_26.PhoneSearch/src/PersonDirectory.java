/*
 * @author Timdpr
 * Uses JDK 8
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PersonDirectory {
    private List<Person> people = new ArrayList<>();
    private Map<String, Person> namePerson = new HashMap<>();
    private Map<Set<String>, Person> numberPerson = new HashMap<>();
    private Map<String, Person> addressPerson = new HashMap<>();

    public void addPerson(Person person) {
        this.people.add(person);
        this.namePerson.put(person.getName(), person);
        this.numberPerson.put(person.getNumbers(), person);
        this.addressPerson.put(person.getAddress(), person);
    }
    
    public void addNumber(String name, String number) {
        if (this.namePerson.containsKey(name)) {
            Person person = getPersonByName(name);
            person.addNumber(number);
            this.numberPerson.put(person.getNumbers(), person);
            
        } else {
            Person person = new Person(name);
            person.addNumber(number);
            this.addPerson(person);
        }
    }
    
    public void addAddress(String name, String street, String city) {
        if (this.namePerson.containsKey(name)) {
            Person person = getPersonByName(name);
            person.addAddress(street, city);
            this.addressPerson.put(person.getAddress(), person);
            
        } else {
            Person person = new Person(name);
            person.addAddress(street, city);
            this.addPerson(person);
        }
    }
    
    public boolean containsPersonByName(String name) {
        return this.namePerson.containsKey(name);
    }
    
    public boolean containsPersonByNumber(String number) {
        for (Set<String> set : this.numberPerson.keySet()) {
            if (set.contains(number)) {
                return true;
            }
        }
        return false;
    }
    
    public Person getPersonByName(String name) {
        return this.namePerson.get(name);
    }
    
    public String getNameByNumber(String number) {
        for (Person p : this.people) {
            if (p.getNumbers().contains(number)) {
                return p.getName();
            }
        }
        return "not found";
    }
    
    public void deleteInfoByName(String name) {
        Person person = getPersonByName(name);
        
        this.numberPerson.remove(person.getNumbers());
        this.addressPerson.remove(person.getAddress());
        this.namePerson.remove(name);
        this.people.remove(person);
    }
    
    public List<Person> searchPersonByKeyword(String kw) {
        List<Person> personList = new ArrayList<>();
        if (kw.isEmpty()) {
            return this.people;
        }
        
        for (Person p : this.people) {
            if (p.getName().contains(kw) || p.getAddress().contains(kw)) {
                personList.add(p);
            } else {
                for (String number : p.getNumbers()) {
                    if (number.contains(kw)) {
                        personList.add(p);
                    }
                }
            }
        }
        return personList;
    }
}
