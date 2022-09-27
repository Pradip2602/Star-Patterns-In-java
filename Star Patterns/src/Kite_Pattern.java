public class Kite_Pattern {
    public static void main(String[] args) {
        kite_pattern(8);
    }
    static void kite_pattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            for (int k = 2; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int k = n; k >= i; k--) {
                System.out.print("* ");
            }
            for (int m = n; m >= i; m--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 10; i++) {
            tail();
        }
    }
    static void tail() {
        for (int i = 1; i <18; i++) {
            System.out.print(" ");
        }
        System.out.print("* \n");
    }
}
