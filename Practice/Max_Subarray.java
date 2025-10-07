/*
 Max Subarray

Have the function MaxSubarray(arr) take the array of numbers stored in arr and determine the largest sum that can be formed 
by any contiguous subarray in the array. For example, if arz is [-2, 5, -1, 7, -3] then your program should 
return 11 because the sum is formed by the subarray [5, -1, 7]. 
Adding any element before or after this subarray would make the sum smaller.

Examples

Input: new int[] {1, -2, 0, 3}

Output: 3

Input: new int[] {3, -1, -1, 4, 3, -1)

Output: 8
 */
package Practice;

import java.util.Scanner;

public class Max_Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the value into the Array: ");
        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The expected output is: " + maxSubArray(arr));
    }

    public static int maxSubArray(int[] arr) {
        int maxSoFar = arr[0];
        int currentSum = arr[0];

        for(int i = 1;i<arr.length;i++){
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSoFar = Math.max(currentSum, maxSoFar);
        }

        return maxSoFar;
    }
}
