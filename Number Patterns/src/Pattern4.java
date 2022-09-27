/*
                8 7 6 5 4 3 2 1
                8 7 6 5 4 3 2
                8 7 6 5 4 3
                8 7 6 5 4
                8 7 6 5
                8 7 6
                8 7
                8

 */

public class Pattern4 {
    public static void main(String[] args) {
        pattern4(8);
    }
    static void pattern4(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = n; j>=i; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
