// * * * * * 
//  * * * * 
//   * * * 
//    * * 
//     * 

package Patter_Program;

import java.util.Scanner;

public class inverted_pyramid_of_stars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // print stars with space
            for (int k = 0; k < n - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
