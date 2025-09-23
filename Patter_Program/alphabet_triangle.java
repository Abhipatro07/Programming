// A
// A B
// A B C
// A B C D
// A B C D E

package Patter_Program;

import java.util.Scanner;

public class alphabet_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();

        for(int i = 0;i<=n-1;i++){
            for(int j = 0;j<=i;j++){
                System.out.print((char) ('A' + j) + " ");
            }

            System.out.println();
        }
    }
}
