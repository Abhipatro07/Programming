//!   Count Triplets That Can Form Triangles — i.e., count triplets (i, j, k) such that the sum of any two sides > the third side.
/*
Test Case 1️⃣
Input: [4, 6, 3, 7]
Expected Output: 3
Explanation:
Possible triplets that can form a triangle:
(3, 4, 6), (4, 6, 7), (3, 6, 7)

--------------------------------------------------

Test Case 2️⃣
Input: [10, 21, 22, 100, 101, 200, 300]
Expected Output: 6
Explanation:
Valid triplets:
(10, 21, 22), (21, 100, 101), (22, 100, 101), (100, 101, 200),
(100, 200, 300), (101, 200, 300)

--------------------------------------------------

Test Case 3️⃣
Input: [2, 2, 3, 4]
Expected Output: 3
Explanation:
Valid triplets:
(2, 3, 4), (2, 3, 4) — the first two 2's are different indices,
and (2, 2, 3)

--------------------------------------------------

Test Case 4️⃣
Input: [4, 2, 10]
Expected Output: 0
Explanation:
No triplet satisfies the triangle condition.
2 + 4 = 6 < 10 → not valid.

--------------------------------------------------

Test Case 5️⃣
Input: [1, 1, 1, 1]
Expected Output: 4
Explanation:
All triplets of 1s can form triangles.
Number of triplets = 4C3 = 4.

--------------------------------------------------

Test Case 6️⃣
Input: [5, 5, 5]
Expected Output: 1
Explanation:
(5, 5, 5) forms an equilateral triangle.

--------------------------------------------------

Test Case 7️⃣
Input: [10, 50, 5, 1]
Expected Output: 0
Explanation:
No triplet satisfies triangle inequality.

--------------------------------------------------

Test Case 8️⃣
Input: [3, 5, 7, 9, 12]
Expected Output: 9
Explanation:
Valid triplets include:
(3,5,7), (3,7,9), (5,7,9), (5,9,12), (7,9,12), (3,9,12), (5,7,12), etc.

--------------------------------------------------

Test Case 9️⃣
Input: [2, 3, 4, 5, 10]
Expected Output: 3
Explanation:
Valid triplets: (2,3,4), (3,4,5), (2,4,5)

--------------------------------------------------

Test Case 🔟
Input: [6, 10, 12, 14, 18, 20]
Expected Output: 15
Explanation:
Several valid triplets exist since all satisfy the triangle condition.
*/

package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Count_triplets_that_can_form_triangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter the values into the array: ");
        int arr[] = new int[n];
        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        int count = countTriangle(arr);
        System.out.println("The number of triangle possibles from the given array is: " + count);
    }

    public static int countTriangle(int[] arr) {
        if(arr.length < 3){
            return 0;
        }

        Arrays.sort(arr);

        int count = 0;

        for(int i = arr.length-1;i>=1;i--){
            int left = 0;
            int right = i-1;

            while(left < right){
                if(arr[left] + arr[right] > arr[i]){
                    count = count + (right - left);
                    right--;
                }
                else{
                    left++;
                }
            }
        }

        return count;
    }
}
