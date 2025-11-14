/*
 Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
Example:
Input: nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output: 6
Explanation: The contiguous subarray [4, -1, 2, 1] has the largest sum = 6.
 */
package Practice;

import java.util.Scanner;

public class Code14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the value into the array: ");
        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        int res = maxSubArray(arr);
        System.out.println("The Maximum subarray Sum is: " + res);
    }

    public static int maxSubArray(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];


        for(int i = 0;i<=arr.length-1;i++){
            currentSum = Math.max(arr[i] , currentSum + arr[i]);
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }
    
}
