/**
 * OOPSBannerAppUC5
 * Use Case 5 (UC5): Printing the text "OOPS" as an ASCII banner using
 * String.join()
 * cleanly allocated via inline Array Initialization within a String array and
 * iterated via an Enhanced For-Loop.
 * 
 * @author ak5807-47
 * @version 1.0
 */
public class OOPSBannerAppUC5 {

    /**
     * The main method, serving as the application's entry point.
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {

        // Define and populate the String array in a single concise Array Initialization
        // statement
        String[] bannerLines = {
                String.join("", "  ***  ", "   ***  ", " ******* ", "  ****  "),
                String.join("", " *   * ", "  *   * ", " *      *", " *    * "),
                String.join("", "*     *", " *     *", " *      *", " *      "),
                String.join("", "*     *", " *     *", " ******* ", "  ****  "),
                String.join("", "*     *", " *     *", " *       ", "      * "),
                String.join("", " *   * ", "  *   * ", " *       ", " *    * "),
                String.join("", "  ***  ", "   ***  ", " *       ", "  ****  ")
        };

        // Output each line smoothly with no hardcoded indices
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
