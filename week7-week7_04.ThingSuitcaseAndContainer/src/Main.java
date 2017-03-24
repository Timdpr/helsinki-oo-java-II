public class Main {
    public static void main(String[] Container) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        // adding 100 suitcases with one brick in each        
        for (int i = 0; i < 100; i++) {
            Thing brick = new Thing("brick", i+1);
            Suitcase s = new Suitcase(100);
            s.addThing(brick);
            container.addSuitcase(s);
        }
    }
}