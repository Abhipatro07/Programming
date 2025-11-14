/*
🔹 Test Cases for Check_if_a_matrix_is_sparse

--------------------------------------------------
🧩 Test Case 1 — Basic 3x3 Sparse Matrix
Input:
Matrix =
[5, 0, 0]
[0, 8, 0]
[0, 0, 9]

Total elements = 9
Zero elements  = 6
Expected Output:
"Matrix is Sparse"
Explanation:
6 > 9/2 → Sparse

--------------------------------------------------
🧩 Test Case 2 — Dense 3x3 Matrix (Few Zeros)
Input:
Matrix =
[1, 2, 3]
[4, 0, 6]
[7, 8, 9]

Total elements = 9
Zero elements  = 1
Expected Output:
"Matrix is Not Sparse"
Explanation:
1 < 9/2 → Not Sparse

--------------------------------------------------
🧩 Test Case 3 — All Zeros
Input:
Matrix =
[0, 0]
[0, 0]

Total elements = 4
Zero elements  = 4
Expected Output:
"Matrix is Sparse"
Explanation:
4 > 4/2 → Sparse

--------------------------------------------------
🧩 Test Case 4 — No Zeros at All
Input:
Matrix =
[1, 2]
[3, 4]

Total elements = 4
Zero elements  = 0
Expected Output:
"Matrix is Not Sparse"
Explanation:
0 < 4/2 → Not Sparse

--------------------------------------------------
🧩 Test Case 5 — 4x3 Matrix (Rectangular)
Input:
Matrix =
[0, 0, 3]
[0, 5, 0]
[0, 0, 0]
[6, 0, 0]

Total elements = 12
Zero elements  = 9
Expected Output:
"Matrix is Sparse"
Explanation:
9 > 12/2 → Sparse

--------------------------------------------------
🧩 Test Case 6 — Single Row Matrix
Input:
Matrix =
[0, 1, 0, 2, 0]

Total elements = 5
Zero elements  = 3
Expected Output:
"Matrix is Sparse"
Explanation:
3 > 5/2 → Sparse

--------------------------------------------------
🧩 Test Case 7 — Single Column Matrix
Input:
Matrix =
[0]
[1]
[0]
[2]

Total elements = 4
Zero elements  = 2
Expected Output:
"Matrix is Not Sparse"
Explanation:
2 is NOT > 4/2 (equal only)

--------------------------------------------------
🧩 Test Case 8 — Large 5x5 Matrix
Input:
Matrix =
[0, 0, 0, 4, 5]
[0, 0, 0, 0, 0]
[6, 0, 7, 0, 0]
[0, 8, 0, 9, 0]
[0, 0, 0, 0, 1]

Total elements = 25
Zero elements  = 17
Expected Output:
"Matrix is Sparse"
Explanation:
17 > 12.5 → Sparse

--------------------------------------------------
🧩 Test Case 9 — Edge Case: 1x1 Matrix (Zero)
Input:
Matrix =
[0]

Expected Output:
"Matrix is Sparse"

--------------------------------------------------
🧩 Test Case 10 — Edge Case: 1x1 Matrix (Non-zero)
Input:
Matrix =
[5]

Expected Output:
"Matrix is Not Sparse"
--------------------------------------------------
*/

package Arrays;

import java.util.Scanner;

public class Check_if_a_matrix_is_sparse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows size: ");
        int rows = sc.nextInt();
        System.out.println("Enter the columns size: ");
        int columns = sc.nextInt();

        System.out.println("Enter the values into the matix: ");
        int matrix[][] = new int[rows][columns];

        for(int i = 0;i<rows;i++){
            for(int j = 0;j<columns;j++){
                matrix[i][j] = sc.nextInt();
            }
        }


        if(isSparse(matrix , rows , columns)){
            System.out.println("The given matrix is sparsed");
        }
        else{
            System.out.println("The given matrix is not sparsed");
        }
    }

    public static boolean isSparse(int[][] matrix , int rows , int columns) {
        int zeroEle = 0;
        int totalEle = rows * columns;

        for(int i = 0;i<rows;i++){
            for(int j = 0;j<columns;j++){
                if(matrix[i][j] == 0){
                    zeroEle++;
                }
            }
        }

        if(zeroEle > totalEle/2){
            return true;
        }
        else{
            return false;
        }
    }
}
