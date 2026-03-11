import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerAppUC8
 * Use Case 8 (UC8): Using HashMap for centralized O(1) character lookup
 * and rendering strings dynamically with standard iteration pipelines.
 * 
 * @author ak5807-47
 * @version 1.0
 */
public class OOPSBannerAppUC8 {

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
     * Reusable logic to extract ASCII configurations straight from the HashMap
     * structure
     * iteratively scaling over any string length seamlessly.
     * 
     * @param word       Target literal phrase
     * @param patternMap Global Character-to-Array logic lookup definitions
     */
    public static void renderBanner(String word, Map<Character, String[]> patternMap) {
        // Iterate vertically across standard 7-line configuration
        for (int i = 0; i < 7; i++) {
            StringBuilder sb = new StringBuilder();

            // Loop through each physical letter character on horizontal X-axis
            for (char c : word.toCharArray()) {
                String[] pattern = patternMap.get(c);
                if (pattern != null) {
                    sb.append(pattern[i]).append(" ");
                } else {
                    sb.append("       "); // Empty space fallback if letter wasn't mapped
                }
            }
            System.out.println(sb.toString());
        }
    }

    /**
     * The main method, serving as the application's entry point.
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {

        // Instantiate the HashMap
        Map<Character, String[]> patternMap = new HashMap<>();

        // Centrally populate O(1) lookup Map data arrays natively
        patternMap.put('O', getO());
        patternMap.put('P', getP());
        patternMap.put('S', getS());

        // Call the decoupled functional process
        renderBanner("OOPS", patternMap);
    }
}
