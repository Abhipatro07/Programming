/*
Test Cases for rotate_array_right_by_k_steps:

1. Input: arr = [1, 2, 3, 4, 5], k = 1
   Output: [5, 1, 2, 3, 4]
   Explanation: Right shift by 1 places last element at front.

2. Input: arr = [1, 2, 3, 4, 5], k = 2
   Output: [4, 5, 1, 2, 3]
   Explanation: Last 2 elements come to front.

3. Input: arr = [10, 20, 30, 40, 50], k = 5
   Output: [10, 20, 30, 40, 50]
   Explanation: Rotation by array size gives same array.

4. Input: arr = [10, 20, 30, 40, 50], k = 7
   Output: [40, 50, 10, 20, 30]
   Explanation: k=7 → effective rotation = k % n = 2.

5. Input: arr = [100], k = 3
   Output: [100]
   Explanation: Single element array remains same.

6. Input: arr = [], k = 2
   Output: []
   Explanation: Empty array stays empty.

7. Input: arr = [1, 2, 3, 4, 5, 6], k = 3
   Output: [4, 5, 6, 1, 2, 3]
   Explanation: Last 3 elements move to front.

8. Input: arr = [-1, -2, -3, -4], k = 1
   Output: [-4, -1, -2, -3]
   Explanation: Works with negative numbers.

9. Input: arr = [1, 2, 3, 4, 5, 6], k = 0
   Output: [1, 2, 3, 4, 5, 6]
   Explanation: Rotation by 0 → no change.

10. Input: arr = [7, 8, 9, 10, 11], k = 4
    Output: [8, 9, 10, 11, 7]
    Explanation: Last 4 elements move in order, first element goes to end.
*/

package Arrays;

import java.util.Scanner;

public class rotate_array_right_by_k_steps {
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

        // Rotate array right by k steps
        rotateRight(arr, k);

        // Print result
        System.out.print("Array after rotating right by " + k + " steps: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Function to rotate right by k steps
    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;

        reverse(arr, 0, n - 1);      // Reverse whole array
        reverse(arr, 0, k - 1);     // Reverse first k elements
        reverse(arr, k, n - 1);          // Reverse remaining elements
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
