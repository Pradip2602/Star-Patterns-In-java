/*
                 * * * * * * * * * * * * * * *
                   * * * * * * * * * * * * *
                    * * * * * * * * * * *
                      * * * * * * * * *
                        * * * * * * *
                          * * * * *
                            * * *
                              *

 */
public class Pattern6 {
    public static void main(String[] args) {
        pattern6(8);
    }
    static void pattern6(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j=1; j<=i; j++){
                System.out.print("  ");
            }
            for (int k=n; k>=i; k--){
                System.out.print("* ");
            }
            for (int m=n-1; m>=i; m--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
