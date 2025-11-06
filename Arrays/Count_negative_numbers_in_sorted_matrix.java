/*
🔹 Test Cases for Count_negative_numbers_in_sorted_matrix

--------------------------------------------------
🧩 Test Case 1 — Basic 3x3 Matrix
Input:
Matrix =
[-3, -2, -1]
[-2,  2,  3]
[ 0,  1,  5]

Expected Output:
4
Explanation:
Negatives are: -3, -2, -1, -2

--------------------------------------------------
🧩 Test Case 2 — All Negative Numbers
Input:
Matrix =
[-5, -4, -3]
[-4, -3, -2]
[-2, -1, -1]

Expected Output:
9
Explanation:
Every element is negative.

--------------------------------------------------
🧩 Test Case 3 — All Positive Numbers
Input:
Matrix =
[1, 2, 3]
[4, 5, 6]
[7, 8, 9]

Expected Output:
0
Explanation:
No negative numbers.

--------------------------------------------------
🧩 Test Case 4 — Mixed Matrix (Some Negative Rows)
Input:
Matrix =
[-10, -5, 0]
[-3, -1, 1]
[ 2,  4, 5]

Expected Output:
4
Explanation:
Negatives: -10, -5, -3, -1

--------------------------------------------------
🧩 Test Case 5 — Single Row
Input:
Matrix =
[-5, -4, 0, 2, 3]

Expected Output:
2
Explanation:
Negatives: -5, -4

--------------------------------------------------
🧩 Test Case 6 — Single Column
Input:
Matrix =
[-4]
[-1]
[ 0]
[ 2]

Expected Output:
2
Explanation:
Negatives: -4, -1

--------------------------------------------------
🧩 Test Case 7 — Empty Matrix
Input:
Matrix = []

Expected Output:
0
Explanation:
No elements at all.

--------------------------------------------------
🧩 Test Case 8 — 4x4 Matrix (Descending Order in Rows & Columns)
Input:
Matrix =
[ 4,  3,  2, -1]
[ 3,  2,  1, -1]
[ 1,  1, -1, -2]
[-1, -1, -2, -3]

Expected Output:
8
Explanation:
Negatives: (1 from 1st row) + (1 from 2nd row) + (2 from 3rd) + (4 from last) = 8

--------------------------------------------------
🧩 Test Case 9 — Single Negative Element
Input:
Matrix =
[1, 2, 3]
[4, -1, 6]
[7, 8, 9]

Expected Output:
1
Explanation:
Only -1 is negative.

--------------------------------------------------
🧩 Test Case 10 — Large Numbers (Mixed Signs)
Input:
Matrix =
[-100, -50, -10, 0]
[-5, -1, 10, 20]
[15, 30, 40, 50]

Expected Output:
6
Explanation:
Negatives: -100, -50, -10, -5, -1 (total = 5)
Wait check row1 3 neg, row2 2 neg =5; check again expected=5.

--------------------------------------------------
🧩 Test Case 11 — Matrix with Zeros Only
Input:
Matrix =
[0, 0, 0]
[0, 0, 0]
[0, 0, 0]

Expected Output:
0
Explanation:
Zeros are not negative.

--------------------------------------------------
🧩 Test Case 12 — Large Negative Row at Top
Input:
Matrix =
[-9, -8, -7]
[-6, -5,  0]
[-4, -3,  5]

Expected Output:
7
Explanation:
Negatives: 3 in first row, 2 in second, 2 in third → 7 total.
--------------------------------------------------
*/

package Arrays;

import java.util.Scanner;

public class Count_negative_numbers_in_sorted_matrix {
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

        int res = countNegativeNumber(matrix , rows , columns);
        System.out.println("The total negative number in the matrix is: " + res);
    }

    public static int countNegativeNumber(int[][] matrix , int r , int c) {
        int count = 0;

        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                if(matrix[i][j] < 0){
                    count++;
                }
            }
        }

        return count;
    }
}
