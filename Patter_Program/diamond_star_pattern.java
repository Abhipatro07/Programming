//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 
//  * * * * 
//   * * * 
//    * * 
//     * 

package Patter_Program;

import java.util.Scanner;

public class diamond_star_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        // upper pyramid
        for (int i = 0; i < n; i++) {
            // spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // stars
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // lower inverted pyramid
        for (int i = n - 2; i >= 0; i--) {
            // spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // stars
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
