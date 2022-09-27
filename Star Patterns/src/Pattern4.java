/*
                             *
                           * *
                         * * *
                       * * * *
                     * * * * *
                   * * * * * *
                 * * * * * * *
               * * * * * * * *
 */
public class Pattern4 {
    public static void main(String[] args) {
        pattern4(8);
    }
    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            // printing for spaces
            for (int j = n; j >= i; j--) {
                System.out.print("  ");
            }
            // printing for star
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
