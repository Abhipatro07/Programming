// *****
// *****
// *****

package Patter_Program;

import java.util.Scanner;

public class solid_rectangle_of_stars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size: ");
        int row = sc.nextInt();

        System.out.println("Enter the column size: ");
        int col = sc.nextInt();

        System.out.println("Expected Output is");
        for (int i = 0; i <= row - 1; i++) {
            for (int j = 0; j <= col - 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
