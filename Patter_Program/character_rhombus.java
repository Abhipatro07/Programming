//     A B C D E
//    A B C D E
//   A B C D E
//  A B C D E
// A B C D E


package Patter_Program;

import java.util.Scanner;

public class character_rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n = sc.nextInt();
        
        for(int i = 0;i<=n-1;i++){
            for(int j = 0;j<=n-i-1;j++){
                System.out.print(" ");
            }
            for(int k = 0;k<=n-1;k++){
                System.out.print((char) ('A' + k) + " ");
            }

            System.out.println();
        }
    }
}
