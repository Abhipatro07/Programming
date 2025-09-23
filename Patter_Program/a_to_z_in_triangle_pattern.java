// A
// B C
// D E F
// G H I J
// K L M N O



package Patter_Program;

import java.util.Scanner;

public class a_to_z_in_triangle_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        char ch = 'A';

        for(int i = 0;i<=n-1;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(ch + " ");
                ch++;
                if(ch > 'Z'){
                    ch = 'A';
                }
            }
            System.out.println();
        }
    }
}
