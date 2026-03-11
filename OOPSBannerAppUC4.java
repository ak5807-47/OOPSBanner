/**
 * OOPSBannerAppUC4
 * Use Case 4 (UC4): Printing the text "OOPS" as an ASCII banner using
 * String.join()
 * stored inside a String array and iterated via an Enhanced For-Loop.
 * 
 * @author ak5807-47
 * @version 1.0
 */
public class OOPSBannerAppUC4 {

    /**
     * The main method, serving as the application's entry point.
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {

        // Define a String array holding each joined line of the ASCII banner
        String[] bannerLines = {
                String.join("", "  ***  ", "   ***  ", " ******* ", "  ****  "),
                String.join("", " *   * ", "  *   * ", " *      *", " *    * "),
                String.join("", "*     *", " *     *", " *      *", " *      "),
                String.join("", "*     *", " *     *", " ******* ", "  ****  "),
                String.join("", "*     *", " *     *", " *       ", "      * "),
                String.join("", " *   * ", "  *   * ", " *       ", " *    * "),
                String.join("", "  ***  ", "   ***  ", " *       ", "  ****  ")
        };

        // Output each line directly using an enhanced loop to eliminate redundant print
        // statements
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
