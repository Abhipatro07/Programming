//     *    
//    * *   
//   *   *  
//  *     * 
// *       *
//  *     * 
//   *   *  
//    * *   
//     *    



package Patter_Program;

import java.util.Scanner;

public class hollow_diamond_star_pattern {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n: ");        
    int rows = sc.nextInt();

        int spaces = rows - 1; // initial spaces for first row
        int stars = 1;         // initial stars for first row

        // Upper half
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Print hollow stars
            for (int j = 1; j <= stars; j++) {
                if (j == 1 || j == stars) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
            spaces--;  // decrease spaces
            stars += 2; // increase stars
        }

        spaces = 1;          // reset for lower half
        stars = 2 * rows - 3; // initial stars for bottom half

        // Lower half
        for (int i = rows - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Print hollow stars
            for (int j = 1; j <= stars; j++) {
                if (j == 1 || j == stars) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
            spaces++;  // increase spaces
            stars -= 2; // decrease stars
        }
    }
}
