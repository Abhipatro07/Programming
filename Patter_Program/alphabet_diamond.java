//     A
//    A B
//   A B C
//  A B C D
// A B C D E
//  A B C D
//   A B C
//    A B
//     A



package Patter_Program;

import java.util.Scanner;

public class alphabet_diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        // upper pyramid
        for (int i = 0; i < n; i++) {
            // spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // stars
            for (int k = 0; k <= i; k++) {
                System.out.print((char)('A' + k) + " ");
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
                System.out.print((char)('A' + k) + " ");
            }
            System.out.println();
        }
    }
}
