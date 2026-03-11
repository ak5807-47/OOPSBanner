/**
 * OOPSBannerAppUC7
 * Use Case 7 (UC7): Printing the text "OOPS" as an ASCII banner using
 * an Object-Oriented design structure with a static inner class
 * CharacterPatternMap.
 * 
 * @author ak5807-47
 * @version 1.0
 */
public class OOPSBannerAppUC7 {

    /**
     * Inner class adhering to the Single Responsibility Principle, mapping
     * character instances to their respective ASCII array string layouts.
     */
    public static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return this.character;
        }

        public String[] getPattern() {
            return this.pattern;
        }
    }

    public static String[] getO() {
        return new String[] {
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
        };
    }

    public static String[] getP() {
        return new String[] {
                " ******* ",
                " *      *",
                " *      *",
                " ******* ",
                " *       ",
                " *       ",
                " *       "
        };
    }

    public static String[] getS() {
        return new String[] {
                "  ****  ",
                " *    * ",
                " *      ",
                "  ****  ",
                "      * ",
                " *    * ",
                "  ****  "
        };
    }

    /**
     * The main method, serving as the application's entry point.
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {

        // Instantiate Object Maps encapsulating raw parameters
        CharacterPatternMap oMap = new CharacterPatternMap('O', getO());
        CharacterPatternMap pMap = new CharacterPatternMap('P', getP());
        CharacterPatternMap sMap = new CharacterPatternMap('S', getS());

        // Define the sequence of characters via an Object Array
        CharacterPatternMap[] word = { oMap, oMap, pMap, sMap };

        // Output loop using StringBuilder for optimal dynamic scaling and rendering
        for (int i = 0; i < 7; i++) {
            StringBuilder sb = new StringBuilder();

            for (CharacterPatternMap map : word) {
                sb.append(map.getPattern()[i]).append(" ");
            }

            System.out.println(sb.toString());
        }
    }
}
