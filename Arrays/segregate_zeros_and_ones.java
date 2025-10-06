/*
Test Cases for segregate_zeros_and_ones:

1. Input: [0, 1, 0, 1, 1, 0]
   Expected Output: [0, 0, 0, 1, 1, 1]
   Explanation: All 0s are moved to the left, 1s to the right.

2. Input: [1, 0, 1, 0, 1, 0, 1, 0]
   Expected Output: [0, 0, 0, 0, 1, 1, 1, 1]
   Explanation: Zeros grouped first, ones later.

3. Input: [0, 0, 0, 0]
   Expected Output: [0, 0, 0, 0]
   Explanation: Already all zeros, no change.

4. Input: [1, 1, 1, 1]
   Expected Output: [1, 1, 1, 1]
   Explanation: Already all ones, no change.

5. Input: [1, 0]
   Expected Output: [0, 1]
   Explanation: Swap 1 and 0.

6. Input: [0, 1]
   Expected Output: [0, 1]
   Explanation: Already segregated.

7. Input: [1, 0, 0, 1, 0, 1]
   Expected Output: [0, 0, 0, 1, 1, 1]
   Explanation: All zeros to left, ones to right.

8. Input: [0]
   Expected Output: [0]
   Explanation: Single element, unchanged.

9. Input: [1]
   Expected Output: [1]
   Explanation: Single element, unchanged.

10. Input: []
    Expected Output: []
    Explanation: Empty array remains empty.
*/

package Arrays;

import java.util.Scanner;

public class segregate_zeros_and_ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array (0's and 1's only into the array): ");
        int n = sc.nextInt();
        System.out.println("Enter the values into the array (Enter only 0's and 1's into the array): ");
        int arr[] = new int[n];
        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        segregateZerosAndOnes(arr);

        System.out.println("After segregate the zeros and ones: ");
        for(int num : arr){
            System.out.println(num);
        }
    }

    public static void segregateZerosAndOnes(int[] arr) {
        int ones = 0;

        for(int i = 0; i<=arr.length - 1;i++){
            if(arr[i] != 1){
                arr[ones] = arr[i];
                ones++;
            }
        }

        while(ones < arr.length){
            arr[ones] = 1;
            ones++;
        }
    }
}
