/*
Test Cases for Find_subarray_with_0_sum (showing actual subarray):

1️⃣ Input: [4, 2, -3, 1, 6]
    Expected Output: [4, 2, -3]
    Explanation: Sum = 0.

2️⃣ Input: [4, 2, 0, 1, 6]
    Expected Output: [0]
    Explanation: Single element 0 gives sum = 0.

3️⃣ Input: [-3, 2, 3, 1, 6]
    Expected Output: []
    Explanation: No subarray with sum = 0.

4️⃣ Input: [1, 2, -3, 3]
    Expected Output: [1, 2, -3]
    Explanation: Sum = 0.

5️⃣ Input: [1, 2, -2, 4, -4]
    Expected Output: [2, -2]
    Explanation: Subarray [2, -2] gives sum = 0 (also [4, -4] possible).

6️⃣ Input: [0]
    Expected Output: [0]
    Explanation: Single zero gives sum = 0.

7️⃣ Input: [5]
    Expected Output: []
    Explanation: No subarray gives sum = 0.

8️⃣ Input: []
    Expected Output: []
    Explanation: Empty array — no subarray possible.

9️⃣ Input: [3, -1, -2, 5, -5]
    Expected Output: [3, -1, -2]
    Explanation: This subarray gives sum = 0 (also [5, -5] possible).

🔟 Input: [2, 4, -6, 1, -1]
    Expected Output: [2, 4, -6]
    Explanation: Sum = 0.

11️⃣ Input: [-1, 1, -1, 1]
    Expected Output: [-1, 1]
    Explanation: First two elements sum = 0.

12️⃣ Input: [10, 20, -10, -10]
    Expected Output: [20, -10, -10]
    Explanation: Sum = 0.

13️⃣ Input: [7, -3, -4, 2, -2]
    Expected Output: [7, -3, -4]
    Explanation: Sum = 0.

14️⃣ Input: [8, 5, -9, 4, -8]
    Expected Output: []
    Explanation: No subarray sums to 0.

15️⃣ Input: [1, 2, 3, -3, -2, -1]
    Expected Output: [1, 2, 3, -3, -2, -1]
    Explanation: The entire array sums to 0.
*/


package Arrays;

import java.util.Scanner;

public class Find_subarray_with_0_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the value into the array: ");
        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        subarrayWithZeroSum(arr);
    }

    public static void subarrayWithZeroSum(int[] arr) {
        int n = arr.length;
        boolean found = false;

        for (int start = 0; start < n; start++) {
            int sum = 0;

            for (int end = start; end < n; end++) {
                sum += arr[end];

                if (sum == 0) {
                    found = true;
                    System.out.print("Expected Output is: [");
                    for (int k = start; k <= end; k++) {
                        System.out.print(arr[k]);
                        if (k < end) System.out.print(", ");
                    }
                    System.out.println("]");
                    return;
                }
            }
        }

        if (!found) {
            System.out.println("Expected Output is: []");
        }
    }
}
