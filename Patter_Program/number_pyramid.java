//         1
//       2 2 2
//     3 3 3 3 3
//   4 4 4 4 4 4 4
// 5 5 5 5 5 5 5 5 5



package Patter_Program;

import java.util.Scanner;

public class number_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the pyramid: ");
        int n = sc.nextInt();
        int x = 1;

         for (int i = 0; i <= n - 1; i++) {
             // print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // print stars with space
            for (int k = 0; k <= i; k++) {
                System.out.print(x + " ");
            }
            x++;
            System.out.println();
        }
    }
}
