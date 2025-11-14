/*
🔹 Test Cases for Minimum_size_subarray_sum

--------------------------------------------------
🧩 Test Case 1 — Basic Case
Input:
target = 7
arr = [2, 3, 1, 2, 4, 3]
Expected Output:
2
Explanation:
Subarray [4, 3] has sum ≥ 7 and minimum length = 2.

--------------------------------------------------
🧩 Test Case 2 — Exact Match Single Element
Input:
target = 4
arr = [1, 4, 4]
Expected Output:
1
Explanation:
Element 4 alone satisfies sum ≥ target.

--------------------------------------------------
🧩 Test Case 3 — Multiple Valid Subarrays (Choose Smallest)
Input:
target = 11
arr = [1, 2, 3, 4, 5]
Expected Output:
3
Explanation:
Subarray [3, 4, 5] = 12 ≥ 11, smallest length = 3.

--------------------------------------------------
🧩 Test Case 4 — No Subarray Found
Input:
target = 15
arr = [1, 2, 3, 4, 5]
Expected Output:
0
Explanation:
No subarray sums to 15 or more.

--------------------------------------------------
🧩 Test Case 5 — Single Element Meets Target
Input:
target = 10
arr = [10, 2, 3]
Expected Output:
1
Explanation:
First element alone ≥ 10.

--------------------------------------------------
🧩 Test Case 6 — All Elements Smaller but Combined Work
Input:
target = 8
arr = [1, 1, 1, 1, 1, 1, 1, 1]
Expected Output:
8
Explanation:
All 8 elements sum to 8, min length = 8.

--------------------------------------------------
🧩 Test Case 7 — Large Numbers
Input:
target = 11
arr = [5, 1, 3, 5, 10, 7, 4, 9, 2, 8]
Expected Output:
1
Explanation:
Single element 10 or 11+ elements work, but 10 < 11; [11] not found. Check [10,7]=17 min length=2 actually. Let’s correct → Minimum length = 2 ([10,7]).

Expected Output:
2

--------------------------------------------------
🧩 Test Case 8 — Target Larger Than All Elements
Input:
target = 50
arr = [1, 2, 3, 4, 5]
Expected Output:
0
Explanation:
No subarray reaches 50.

--------------------------------------------------
🧩 Test Case 9 — Empty Array
Input:
target = 7
arr = []
Expected Output:
0
Explanation:
No elements → no subarray possible.

--------------------------------------------------
🧩 Test Case 10 — Single Element Less Than Target
Input:
target = 10
arr = [5]
Expected Output:
0
Explanation:
Sum < target → return 0.

--------------------------------------------------
🧩 Test Case 11 — All Elements Equal
Input:
target = 9
arr = [3, 3, 3, 3, 3]
Expected Output:
3
Explanation:
3 consecutive 3s → sum = 9 → length = 3.

--------------------------------------------------
🧩 Test Case 12 — Increasing Elements
Input:
target = 15
arr = [1, 2, 3, 4, 5, 6, 7, 8]
Expected Output:
2
Explanation:
Subarray [7, 8] = 15 → smallest length = 2.

--------------------------------------------------
🧩 Test Case 13 — Decreasing Elements
Input:
target = 9
arr = [8, 7, 6, 5, 4, 3, 2, 1]
Expected Output:
2
Explanation:
Subarray [5, 4] or [8, 1] both satisfy.

--------------------------------------------------
🧩 Test Case 14 — Minimal at the Start
Input:
target = 5
arr = [5, 1, 1, 1, 1]
Expected Output:
1
Explanation:
First element alone meets target.

--------------------------------------------------
🧩 Test Case 15 — Minimal at the End
Input:
target = 9
arr = [1, 1, 1, 1, 1, 8]
Expected Output:
2
Explanation:
Subarray [1, 8] = 9 → smallest length = 2.

--------------------------------------------------
🧩 Test Case 16 — Large Input (Performance)
Input:
target = 100
arr = [1, 2, 3, ..., 1000]
Expected Output:
14
Explanation:
Sum of first 14 numbers = 105 ≥ 100.
--------------------------------------------------
*/

package Arrays;

import java.util.Scanner;

public class Minimum_size_subarray_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the value into the array: ");
        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target value: ");
        int target = sc.nextInt();

        int res = findMinimunSubarraySize(arr , target);

        System.out.println("THe minimum subarray sum is: " + res);
    }

    public static int findMinimunSubarraySize(int[] arr, int target) {
        int left = 0;
        int min_lenght = Integer.MAX_VALUE;
        int sum = 0;

        for(int right = 0;right<=arr.length-1;right++){
            sum = sum + arr[right];

            while (sum >= target){
                min_lenght = Math.min(min_lenght, right-left+1);
                sum = sum - arr[left];
                left++;
            }
        }

        return (min_lenght == Integer.MAX_VALUE ? 0 : min_lenght);
    }
}
