public class Main {

    public static void main(String[] args) {
    }
    
    public static boolean isAWeekDay(String string) {
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }
    
    public static boolean allVowels(String string) {
        return (string.matches("[aeiouäö]+"));
    }
    
    public static boolean clockTime(String string) {
        if (string.matches("\\d\\d:\\d\\d:\\d\\d")) {
            String[] hms = string.split(":");
            return (Integer.parseInt(hms[0]) <= 23 &&
                    Integer.parseInt(hms[1]) <= 60 &&
                    Integer.parseInt(hms[2]) <= 60 );
        }
        return false;
        // The official solution nicely uses this big ol' regex:
        // ([01][0123456789]|2[0123]):[012345][0123456789]:[012345][0123456789]
    }
}
