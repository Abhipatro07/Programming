/*
Test Case 1:
Input:
arr = [1, 2, 3, 4, 5]
target = 9

Expected Output:
Subarray from index 1 to 3  → [2, 3, 4]
Subarray from index 3 to 4  → [4, 5]


--------------------------------------------------------

Test Case 2:
Input:
arr = [10, 2, -2, -20, 10]
target = -10

Expected Output:
Subarray from index 0 to 3  → [10, 2, -2, -20]
Subarray from index 1 to 4  → [2, -2, -20, 10]


--------------------------------------------------------

Test Case 3:
Input:
arr = [1, 1, 1]
target = 2

Expected Output:
Subarray from index 0 to 1  → [1, 1]
Subarray from index 1 to 2  → [1, 1]


--------------------------------------------------------

Test Case 4:
Input:
arr = [3, 4, 7, 2, -3, 1, 4, 2]
target = 7

Expected Output:
Subarray from index 0 to 1  → [3, 4]
Subarray from index 2 to 2  → [7]
Subarray from index 2 to 5  → [7, 2, -3, 1]
Subarray from index 5 to 7  → [1, 4, 2]


--------------------------------------------------------

Test Case 5:
Input:
arr = [5, -1, -1, 5]
target = 3

Expected Output:
Subarray from index 0 to 2  → [5, -1, -1]
Subarray from index 1 to 3  → [-1, -1, 5]


--------------------------------------------------------

Test Case 6:
Input:
arr = [0, 0, 0, 0]
target = 0

Expected Output:
Subarray from index 0 to 0 → [0]
Subarray from index 0 to 1 → [0, 0]
Subarray from index 0 to 2 → [0, 0, 0]
Subarray from index 0 to 3 → [0, 0, 0, 0]
Subarray from index 1 to 1 → [0]
Subarray from index 1 to 2 → [0, 0]
Subarray from index 1 to 3 → [0, 0, 0]
Subarray from index 2 to 2 → [0]
Subarray from index 2 to 3 → [0, 0]
Subarray from index 3 to 3 → [0]
*/

package Arrays;

import java.util.Scanner;

public class Print_all_subarrays_with_given_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the values into the array: ");
        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Give the target sum: ");
        int target = sc.nextInt();

        findAllSubarrayWithGivenSum_BruteForce(arr , target);

    }

    public static void findAllSubarrayWithGivenSum_BruteForce(int[] arr, int target) {
        int n = arr.length;

        for(int start = 0;start<=n-1;start++){
            int sum = 0;

            for(int end = start;end<=n-1;end++){
                sum = sum + arr[end];

                if(sum == target){
                    System.out.print("Subarray from index " + start + " to " + end + "[");

                    for(int k = start; k<=end;k++){
                        System.out.print(arr[k] );
                        if(k < end) {
                            System.out.println(" , ");
                        }
                    }
                    System.out.print("]");
                }
            }
        }
    }
}
