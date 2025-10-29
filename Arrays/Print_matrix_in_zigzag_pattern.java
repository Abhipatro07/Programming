/*
Test Cases for Print_matrix_in_zigzag_pattern:

1️⃣ Input:
   Matrix:
   [
     [1, 2, 3],
     [4, 5, 6],
     [7, 8, 9]
   ]
   Expected Output:
   1 2 3 6 5 4 7 8 9
   Explanation:
   Row 1 (→): 1 2 3
   Row 2 (←): 6 5 4
   Row 3 (→): 7 8 9


2️⃣ Input:
   Matrix:
   [
     [10, 20],
     [30, 40],
     [50, 60]
   ]
   Expected Output:
   10 20 40 30 50 60
   Explanation:
   Row 1 (→): 10 20
   Row 2 (←): 40 30
   Row 3 (→): 50 60


3️⃣ Input:
   Matrix:
   [
     [1, 2, 3, 4]
   ]
   Expected Output:
   1 2 3 4
   Explanation:
   Single row, no zigzag effect.


4️⃣ Input:
   Matrix:
   [
     [1],
     [2],
     [3],
     [4]
   ]
   Expected Output:
   1 2 3 4
   Explanation:
   Single column, straight vertical traversal.


5️⃣ Input:
   Matrix:
   [
     [1, 2],
     [3, 4]
   ]
   Expected Output:
   1 2 4 3
   Explanation:
   Row 1 (→): 1 2
   Row 2 (←): 4 3


6️⃣ Input:
   Matrix:
   [
     [5]
   ]
   Expected Output:
   5
   Explanation:
   Single element.


7️⃣ Input:
   Matrix:
   [
     [1, 2, 3],
     [4, 5, 6]
   ]
   Expected Output:
   1 2 3 6 5 4
   Explanation:
   Row 1 (→): 1 2 3
   Row 2 (←): 6 5 4


8️⃣ Input:
   Matrix:
   [
     [2, 4, 6, 8],
     [1, 3, 5, 7],
     [9, 11, 13, 15],
     [10, 12, 14, 16]
   ]
   Expected Output:
   2 4 6 8 7 5 3 1 9 11 13 15 16 14 12 10
   Explanation:
   Zigzag alternates left-to-right and right-to-left rows.


9️⃣ Input:
   Matrix:
   []
   Expected Output:
   []
   Explanation:
   Empty matrix → no output.


🔟 Input:
   Matrix:
   [
     [1, 2, 3],
     [9, 8, 7],
     [4, 5, 6],
     [0, -1, -2]
   ]
   Expected Output:
   1 2 3 7 8 9 4 5 6 -2 -1 0
   Explanation:
   Zigzag continues alternating per row.
*/

package Arrays;

import java.util.Scanner;

public class Print_matrix_in_zigzag_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows size: ");
        int rows = sc.nextInt();
        System.out.println("Enter the column size: ");
        int col = sc.nextInt();

        System.out.println("Enter the values into the matrix: ");
        int[][] matrix = new int[rows][col];

        for(int i = 0;i<=rows-1;i++){
            for(int j = 0;j<=col-1;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the matrix in ZigZag: ");
        printZigZag(matrix);
    }

    public static void printZigZag(int[][] matrix) {
        if(matrix.length == 0){
            System.out.println("[]");
            return;
        }

        for(int i = 0;i<=matrix.length-1;i++){
            if(i%2 == 0){ //! If it is a even number rows then we will go left to right
                for(int j = 0;j<matrix[i].length;j++){
                    System.out.println(matrix[i][j] + " ");
                }
            }
            else{  //! If it is a odd number rows then we will go right to left
                for(int j = matrix[i].length-1;j>=0;j--){
                    System.out.println(matrix[i][j] + " ");
                }
            }
        }

        System.out.println();
    }
}
