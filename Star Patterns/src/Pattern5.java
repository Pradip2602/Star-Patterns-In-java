/*
                              *
                            * * *
                          * * * * *
                        * * * * * * *
                      * * * * * * * * *
                    * * * * * * * * * * *
                  * * * * * * * * * * * * *
                * * * * * * * * * * * * * * *
              * * * * * * * * * * * * * * * * *
            * * * * * * * * * * * * * * * * * * *
 */
public class Pattern5 {
    public static void main(String[] args) {
        pattern5(10);
    }
    static void pattern5(int n){
        for (int i = 1; i <=n ; i++) {
            // printing spaces
            for (int j=n-1; j>=i; j--){
                System.out.print("  ");
            }
            // printing star pattern1
            for (int k=1; k<=i; k++){
                System.out.print("* ");
            }
            // printing star pattern2
            for (int l=2; l<=i;l++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
