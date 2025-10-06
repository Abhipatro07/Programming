/*
Test Cases for find_missing_number_in_array_1_to_n:

1. Input: [1, 2, 3, 5], n = 5
   Expected Output: 4
   Explanation: Numbers are from 1 to 5, but 4 is missing.

2. Input: [2, 3, 1, 5], n = 5
   Expected Output: 4
   Explanation: Only 4 is missing.

3. Input: [1, 2, 3, 4, 6, 7, 8, 9, 10], n = 10
   Expected Output: 5
   Explanation: 5 is not present in the array.

4. Input: [2], n = 2
   Expected Output: 1
   Explanation: 1 is missing.

5. Input: [1], n = 2
   Expected Output: 2
   Explanation: 2 is missing.

6. Input: [1, 3], n = 3
   Expected Output: 2
   Explanation: 2 is missing.

7. Input: [2, 4, 1, 5, 6], n = 6
   Expected Output: 3
   Explanation: 3 is missing.

8. Input: [1, 2, 3, 4, 5, 6, 7, 9, 10], n = 10
   Expected Output: 8
   Explanation: 8 is missing.

9. Edge Case: Input: [1], n = 1
   Expected Output: No missing number (but usually this case won’t occur, since problem assumes 1 number missing).

10. Edge Case: Empty Array []
    n = 1
    Expected Output: 1
    Explanation: The only number 1 is missing.
*/

package Arrays;

import java.util.Scanner;

public class find_missing_number_in_array_1_to_n {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of n (total numbers from 1 to n): ");
        int n = sc.nextInt();
        
        int arr[] = new int[n-1]; // because one number is missing
        System.out.println("Enter " + (n-1) + " numbers: ");
        for(int i = 0; i < n-1; i++){
            arr[i] = sc.nextInt();
        }
        
        // Expected sum of numbers from 1 to n
        int expectedSum = n * (n + 1) / 2;
        
        // Actual sum of array elements
        int actualSum = 0;
        for(int num : arr){
            actualSum += num;
        }
        
        int missingNumber = expectedSum - actualSum;
        
        System.out.println("Missing number in the array is: " + missingNumber);
    }
}
