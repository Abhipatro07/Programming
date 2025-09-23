// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15

package Patter_Program;

import java.util.Scanner;

public class print_numbers_1_to_n_in_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the number of the Columns: ");
        int n = sc.nextInt();
        int k = 1;

        System.out.println("The excepted pattern is: ");
        for(int i = 0;i<=n-1;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(k + " ");
                k++;
            }

            System.out.println();
        }
    }
}
