/*
🔹 Test Cases for Matrix_boundary_traversal

--------------------------------------------------
🧩 Test Case 1 — Standard 3x3 Matrix
Input:
N = 3, M = 3
Matrix:
1  2  3
4  5  6
7  8  9
Expected Output:
1 2 3 6 9 8 7 4

--------------------------------------------------
🧩 Test Case 2 — Single Row Matrix
Input:
N = 1, M = 4
Matrix:
5  6  7  8
Expected Output:
5 6 7 8

--------------------------------------------------
🧩 Test Case 3 — Single Column Matrix
Input:
N = 4, M = 1
Matrix:
10
20
30
40
Expected Output:
10 20 30 40

--------------------------------------------------
🧩 Test Case 4 — 2x2 Matrix
Input:
N = 2, M = 2
Matrix:
1  2
3  4
Expected Output:
1 2 4 3

--------------------------------------------------
🧩 Test Case 5 — 3x4 Matrix (Rectangular)
Input:
N = 3, M = 4
Matrix:
1  2  3  4
5  6  7  8
9 10 11 12
Expected Output:
1 2 3 4 8 12 11 10 9 5

--------------------------------------------------
🧩 Test Case 6 — 4x3 Matrix (More Rows than Columns)
Input:
N = 4, M = 3
Matrix:
1  2  3
4  5  6
7  8  9
10 11 12
Expected Output:
1 2 3 6 9 12 11 10 7 4

--------------------------------------------------
🧩 Test Case 7 — Single Element Matrix
Input:
N = 1, M = 1
Matrix:
99
Expected Output:
99
--------------------------------------------------
*/

package Arrays;

import java.util.*;

public class Matrix_boundary_traversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows number: ");
        int rows = sc.nextInt();
        System.out.println("Enter the columns number: ");
        int columns = sc.nextInt();

        System.out.println("Enter the values into the matix: ");
        int matrix[][] = new int[rows][columns];

        for(int i = 0;i<rows;i++){
            for(int j = 0;j<columns;j++){
                matrix[i][j] = sc.nextInt();
            }
        }


        System.out.println("The expected output: ");
        boundryTraversal(matrix , rows , columns);
    }

    public static void boundryTraversal(int[][] matrix , int m , int n) {
        if(m == 0 || n == 0){
            System.out.println("This matrix is empty");
            return;
        }

        //! Single row matrix
        if(n == 1){
            for(int i = 0;i<n;i++){
                System.out.println(matrix[0][i] + " ");
                return;
            }
        }
        
        
        //! Single column matrix
        if(m == 1){
            for(int i = 0;i<m;i++){
                System.out.println(matrix[i][0] + " ");
                return;
            }
        }

        //! Top Row
        for(int j = 0;j<m;j++){
            System.out.println(matrix[0][j] + " ");
        }

        //! Right Column
        for(int j = 1;j<n;j++){
            System.out.println(matrix[j][m-1] + " ");
        }

        //! Bottom Rows (In Reverse)
        for(int j = m-2;j >= 0;j--){
            System.out.println(matrix[n-1][j] + " ");
        }

        //! Left Column (in reverse , skip the first and last)
        for(int j = n-2;j > 0;j--){
            System.out.println(matrix[j][0] + " ");
        }
    }
}
