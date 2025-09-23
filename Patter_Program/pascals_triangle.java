//         1
//       1   1
//     1   2   1
//   1   3   3   1
// 1   4   6   4   1


package Patter_Program;

import java.util.Scanner;

public class pascals_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of coulmns: ");        
        int n = sc.nextInt();

        for(int i = 0;i<=n-1;i++){
            for(int j = 0;j<n-i-1;j++){
                System.out.print(" ");
            }

            int num = 1;

            for(int k = 0;k<=i;k++){
                System.out.print(num + " ");

                num = num * (i - k) / (k + 1);
            }
            System.out.println();
        }
    }
}
