// * * * * * 
//  * * * * 
//   * * * 
//    * * 
//     * 
//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 


package Patter_Program;

import java.util.Scanner;

public class sandglass_star_pattern {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n: ");        
    int n = sc.nextInt();

    int star = n-1;
    int space = 0;

    for(int i = 0;i<=n-1;i++){
        for(int j = 0;j<=space;j++){
            System.out.print(" ");
        }
        for(int j = 0;j<=star;j++){
            System.out.print("* ");
        }

        star--;
        space++;

        System.out.println();
    }

    space = n-1;
    star = 0;
    for(int i = 0;i<=n-1;i++){
        for(int j = 0;j<=space;j++){
            System.out.print(" ");
        }
        for(int j = 0;j<=star;j++){
            System.out.print("* ");
        }

        star++;
        space--;

        System.out.println();
    }
    }
}
