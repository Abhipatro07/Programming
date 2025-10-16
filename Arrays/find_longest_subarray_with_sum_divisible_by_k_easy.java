/*
Test Cases for find_longest_subarray_with_sum_divisible_by_k:

1. Input: arr = [2, 7, 6, 1, 4, 5], k = 3  
   Expected Output: Length = 4  
   Explanation: Subarray [7, 6, 1, 4] → sum = 18 → divisible by 3.

2. Input: arr = [3, 6, 9, 12], k = 3  
   Expected Output: Length = 4  
   Explanation: Whole array sum = 30 → divisible by 3.

3. Input: arr = [1, 2, 4, 5], k = 7  
   Expected Output: Length = 0  
   Explanation: No subarray sum divisible by 7.

4. Input: arr = [2, -6, 3, 1, 2, 8, 2], k = 7  
   Expected Output: Length = 4  
   Explanation: Subarray [3, 1, 2, 8] → sum = 14 → divisible by 7.

5. Input: arr = [5, 9, 10, 11, 12, 15], k = 5  
   Expected Output: Length = 5  
   Explanation: Subarray [5, 9, 10, 11, 15] → sum = 50 → divisible by 5.
*/

package Arrays;

import java.util.Scanner;

public class find_longest_subarray_with_sum_divisible_by_k_easy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int maxLength = 0;

        // Check every subarray
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + arr[j];
                if (sum % k == 0) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }

        System.out.println("Length of longest subarray with sum divisible by " + k + " is: " + maxLength);
    }
}

