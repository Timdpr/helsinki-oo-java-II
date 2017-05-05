package boxes;

public class Main {

    public static void main(String[] args) {
        Box box = new OneThingBox();
        box.add(new Thing("a", 1));
        box.add(new Thing("b", 2));
        box.add(new Thing("c", 2));
        System.out.println(box.isInTheBox(new Thing("a")));
    }
}
