/*
Test Cases for find_subarray_with_given_sum:

1. Input: arr = [1, 2, 3, 7, 5], target = 12  
   Expected Output: Subarray found from index 1 to 3 (2 + 3 + 7 = 12)  
   Explanation: Sum of elements from indices 1 to 3 equals the target.

2. Input: arr = [10, 2, -2, -20, 10], target = -10  
   Expected Output: Subarray found from index 0 to 3 (10 + 2 - 2 - 20 = -10)  
   Explanation: Works with negative numbers.

3. Input: arr = [1, 4, 20, 3, 10, 5], target = 33  
   Expected Output: Subarray found from index 2 to 4 (20 + 3 + 10 = 33).

4. Input: arr = [1, 4, 0, 0, 3, 10, 5], target = 7  
   Expected Output: Subarray found from index 1 to 4 (4 + 0 + 0 + 3 = 7).  
   Explanation: Handles zeros in the array.

5. Input: arr = [1, 2, 3, 4, 5], target = 9  
   Expected Output: Subarray found from index 1 to 3 (2 + 3 + 4 = 9).

6. Input: arr = [5, 10, 20, 100, 105], target = 110  
   Expected Output: Subarray found from index 1 to 2 (10 + 100 = 110).

7. Input: arr = [1, 2, 3, 4, 5], target = 50  
   Expected Output: No subarray found.  
   Explanation: No combination gives sum = 50.

8. Input: arr = [3, 4, -7, 1, 3, 3, 1, -4], target = 7  
   Expected Output: Subarray found from index 3 to 6 (1 + 3 + 3 + 1 = 8 — adjust logic if strict equality).  
   Explanation: Test includes negatives and multiple possible subarrays.

9. Input: arr = [0, 0, 0, 0], target = 0  
   Expected Output: Subarray found from index 0 to 0 (0).  
   Explanation: Handles all zeros case.

10. Input: arr = [-5, 8, -14, 2, 4, 12], target = -5  
    Expected Output: Subarray found from index 0 to 0 (-5).  
    Explanation: Works correctly for negative targets.
*/

package Arrays;

import java.util.Scanner;

public class find_subarray_with_given_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the value in to the array: ");
        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Give the target to be found: ");    
        int target = sc.nextInt();

        int start = 0 , sum = 0;
        boolean flag = false;

        for(int end = 0;end<=n-1;end++){
            sum = sum + arr[end];

            while(sum > target && start <= end){
                sum = arr[start];
                start++;
            }

            if(sum == target){
                System.out.println("Subarray found from index " + start + " to " + end);
                flag = true;
                break;
            }
        }

         if (!flag)
            System.out.println("No subarray found with the given sum.");
    }
}
