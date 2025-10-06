/*
Test Cases for move_all_zeros_to_end:

1. Input: [0, 1, 0, 3, 12]
   Expected Output: [1, 3, 12, 0, 0]
   Explanation: All non-zeros shift left, zeros moved to end.

2. Input: [1, 2, 3, 4, 5]
   Expected Output: [1, 2, 3, 4, 5]
   Explanation: No zeros, array remains same.

3. Input: [0, 0, 0, 0]
   Expected Output: [0, 0, 0, 0]
   Explanation: All elements are zeros, array unchanged.

4. Input: [10, 0, 20, 0, 30, 0]
   Expected Output: [10, 20, 30, 0, 0, 0]
   Explanation: Non-zeros {10,20,30} placed first.

5. Input: [0, 5, 0, 1, 0, 3, 0, 2]
   Expected Output: [5, 1, 3, 2, 0, 0, 0, 0]
   Explanation: All non-zeros maintain relative order.

6. Input: [7]
   Expected Output: [7]
   Explanation: Single non-zero element stays same.

7. Input: [0]
   Expected Output: [0]
   Explanation: Single zero remains same.

8. Input: []
   Expected Output: []
   Explanation: Empty array returns empty array.

9. Input: [4, 0, 0, 5, 0, 6]
   Expected Output: [4, 5, 6, 0, 0, 0]
   Explanation: Non-zeros shifted to front, zeros pushed back.

10. Input: [1, 0, 2, 0, 0, 3]
    Expected Output: [1, 2, 3, 0, 0, 0]
    Explanation: Maintain order of non-zeros, all zeros end.
*/

package Arrays;

import java.util.Scanner;

public class move_all_zeros_to_end {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array (0's and 1's only into the array): ");
        int n = sc.nextInt();
        System.out.println("Enter the values into the array (Enter only 0's and 1's into the array): ");
        int arr[] = new int[n];
        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        moveAllZeroToEnd(arr);

        System.out.println("The resultant array is: ");
        for(int num : arr){
            System.out.println(num);
        }
    }

    public static void moveAllZeroToEnd(int[] arr) {
        int nonZeroIndex = 0;  // Points to the position to place next non-zero

        // Move all non-zero elements to the front
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }

        // Fill remaining positions with zeros
        while(nonZeroIndex < arr.length){
            arr[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
        
    }
}
