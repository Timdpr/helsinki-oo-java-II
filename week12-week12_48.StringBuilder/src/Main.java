public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        StringBuilder builder = new StringBuilder();
        builder.append("{\n ");
        
        for (int i = 0; i < t.length; i++) {
            builder.append(t[i]);
            
            if (i != t.length-1) { // if not last int
                builder.append(", ");
                
                if (i % 4 == 3) { // every 4th int
                    builder.append("\n ");
                }
            }
        }        
        builder.append("\n}");
        return builder.toString();
    }
}
