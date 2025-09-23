//     A
//    A B
//   A B C
//  A B C D
// A B C D E


package Patter_Program;

import java.util.Scanner;

public class alphabet_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        for (int i = 0; i <= n - 1; i++) {
             // print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // print alphabets with space
            for (int k = 0; k <= i; k++) {
                System.out.print((char)('A' + k) + " ");
            }
            System.out.println();
        }
    }
}
