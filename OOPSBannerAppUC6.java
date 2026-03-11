/**
 * OOPSBannerAppUC6
 * Use Case 6 (UC6): Printing the text "OOPS" as an ASCII banner using
 * static modular methods to return pre-configured letter matrices.
 * 
 * @author ak5807-47
 * @version 1.0
 */
public class OOPSBannerAppUC6 {

    /**
     * Returns a 7-element String array representing the letter 'O'
     * 
     * @return String array of 'O'
     */
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

    /**
     * Returns a 7-element String array representing the letter 'P'
     * 
     * @return String array of 'P'
     */
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

    /**
     * Returns a 7-element String array representing the letter 'S'
     * 
     * @return String array of 'S'
     */
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

        // Retrieve character patterns from static modular methods
        String[] o = getO();
        String[] p = getP();
        String[] s = getS();

        // Construct the banner by joining corresponding rows from each letter array
        String[] bannerLines = new String[7];
        for (int i = 0; i < 7; i++) {
            // Notice we call 'o' twice, leveraging DRY principles instead of hardcoding
            // another block!
            bannerLines[i] = String.join("", o[i], " ", o[i], " ", p[i], " ", s[i]);
        }

        // Output each line natively matching exactly previous use cases
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
