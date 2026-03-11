/**
 * OOPSBannerAppUC3
 * Use Case 3 (UC3): Printing the text "OOPS" as an ASCII banner using
 * String.join().
 * 
 * @author ak5807-47
 * @version 1.0
 */
public class OOPSBannerAppUC3 {

    /**
     * The main method, serving as the application's entry point.
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        System.out.println(String.join("", "  ***  ", "   ***  ", " ******* ", "  ****  "));
        System.out.println(String.join("", " *   * ", "  *   * ", " *      *", " *    * "));
        System.out.println(String.join("", "*     *", " *     *", " *      *", " *      "));
        System.out.println(String.join("", "*     *", " *     *", " ******* ", "  ****  "));
        System.out.println(String.join("", "*     *", " *     *", " *       ", "      * "));
        System.out.println(String.join("", " *   * ", "  *   * ", " *       ", " *    * "));
        System.out.println(String.join("", "  ***  ", "   ***  ", " *       ", "  ****  "));
    }
}
