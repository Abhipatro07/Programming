//     A
//    A B A
//   A B C B A
//  A B C D C B A
// A B C D E D C B A


package Patter_Program;

import java.util.Scanner;

public class palindromic_alphabet_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        for(int i = 0;i<=n-1;i++){
            for(int j = 0;j<n-i-1;j++){
                System.out.print(" ");
            }

            for(int k = 0;k<=i;k++){
                System.out.print((char) ('A' + k) + " ");
            }

            for(int l = i-1;l>=0;l--){
                System.out.print((char) ('A' + l) + " ");
            }

            System.out.println();
        }
    }
}
