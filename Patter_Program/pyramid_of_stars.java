//     *    
//    * *   
//   * * *  
//  * * * * 
// * * * * *


package Patter_Program;

import java.util.Scanner;

public class pyramid_of_stars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the triangle: ");
        int n = sc.nextInt();

         for (int i = 0; i <= n - 1; i++) {
             // print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // print stars with space
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
