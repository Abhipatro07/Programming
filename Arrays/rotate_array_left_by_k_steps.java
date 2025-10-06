/*
Test Case 1
Input: arr = [1, 2, 3, 4, 5], k = 2
Output: [3, 4, 5, 1, 2]
Explanation: Rotate left by 2 → first 2 elements move to end.

Test Case 2
Input: arr = [10, 20, 30, 40, 50], k = 1
Output: [20, 30, 40, 50, 10]

Test Case 3
Input: arr = [1, 2, 3, 4, 5], k = 5
Output: [1, 2, 3, 4, 5]
Explanation: Rotating by array length gives the same array.

Test Case 4
Input: arr = [7, 8, 9], k = 4
Output: [8, 9, 7]
Explanation: k = 4 is same as k = 4 % 3 = 1 → rotate left by 1.

Test Case 5
Input: arr = [1, 2], k = 3
Output: [2, 1]
Explanation: k = 3 → effective k = 3 % 2 = 1.

Test Case 6
Input: arr = [5], k = 10
Output: [5]
Explanation: Single element remains same.

Test Case 7
Input: arr = [1, 2, 3, 4, 5, 6], k = 3
Output: [4, 5, 6, 1, 2, 3]

Test Case 8 (Empty Array)
Input: arr = [], k = 2
Output: []
Explanation: Empty array stays empty.

Test Case 9
Input: arr = [100, 200, 300, 400], k = 0
Output: [100, 200, 300, 400]

Test Case 10 (Large k value)
Input: arr = [1, 2, 3, 4, 5], k = 12
Output: [3, 4, 5, 1, 2]
Explanation: k = 12 % 5 = 2
*/

package Arrays;

import java.util.Scanner;

public class rotate_array_left_by_k_steps {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input k
        System.out.print("Enter the number of steps (k): ");
        int k = sc.nextInt();

        // Handle cases where k > n
        k = k % n;

        // Rotate array left by k steps
        rotateLeft(arr, k);

        // Print result
        System.out.print("Array after rotating left by " + k + " steps: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void rotateLeft(int[] arr, int k) {
        reverse(arr, 0, k - 1);       // Reverse first part
        reverse(arr, k, arr.length - 1); // Reverse second part
        reverse(arr, 0, arr.length - 1); // Reverse whole array
    }

    // Helper function to reverse elements in an array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
