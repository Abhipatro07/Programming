//     * * * * *
//    *       *
//   *       *
//  *       *
// * * * * *



package Patter_Program;

import java.util.Scanner;

public class hollow_rhombus_star_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row number: ");
        int row = sc.nextInt();
        System.out.println("Enter the column number: ");
        int col = sc.nextInt();

        for(int i = 0;i<=row-1;i++){
            for(int j = 1;j<=row-i;j++){
                System.out.print(" ");
            }

            for(int k = 0;k<=col-1;k++){
                if(i == 0 || i==row-1 || k == 0 || k == col-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
