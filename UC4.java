public class UC4 {
    public static void main(String[] args) {

        String[][] banner = {
            {
                "  ***  ",
                " *   * ",
                " *   * ",
                " *   * ",
                "  ***  "
            },
            {
                "  ***  ",
                " *   * ",
                " *   * ",
                " *   * ",
                "  ***  "
            },
            {
                " ****  ",
                " *   * ",
                " ****  ",
                " *     ",
                " *     "
            },
            {
                "  ***  ",
                " *     ",
                "  ***  ",
                "     * ",
                "  ***  "
            }
        };

        int rows = 5;

        for (int row = 0; row < rows; row++) {
            for (String[] letter : banner) {
                System.out.print(letter[row] + "  ");
            }
            System.out.println();
        }
    }
}