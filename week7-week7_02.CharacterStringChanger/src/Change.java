public class Change {

    private final char fromCharacter;
    private final char toCharacter;
    
    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }
    
    public String change(String characterString) {
        /*
        String returnString = "";
        for (int i = 0; i < characterString.length(); i++) {
            char c = characterString.charAt(i);
            if (characterString.charAt(i) == fromCharacter) {
                returnString = returnString + toCharacter;
            } else {
                returnString = returnString + c;
            }
        }
        return returnString;
        */
        return characterString.replace(fromCharacter, toCharacter);
    }
}

