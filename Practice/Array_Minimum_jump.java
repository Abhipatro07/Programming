/*
 Array Min Jumps

Have the function ArrayMinJumps (arr) take the array of integers stored in arr, 
where each integer represents the maximum number of steps that can be made from that position, 
and determine the least amount of jumps that can be made to reach the end of the array. 
For example: if arr is [1, 5, 4, 6, 9, 3, 0, 0, 1, 3] then your program should 
output the number 3 because you can reach the end of the array from the beginning via the following steps: 
1 -> 5 -> 9 -> END or
1 -> 5 -> 6 -> END. 
Both of these combinations produce a series of 3 steps. 
And as you can see, you don't always have to take the maximum number of jumps at a specific position, 
you can take less jumps even though the number is higher.

If it is not possible to reach the end of the array, return -1.

Examples

Input: new int[] (3, 4, 2, 1, 1, 100)

Output: 2

Input: new int[] {1, 3, 6, 8, 2, 7, 1, 2, 1, 2, 6, 1, 2, 1, 2)

Output: 4
 */
package Practice;

import java.util.Scanner;

public class Array_Minimum_jump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");        
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the values into the array: ");
        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        int res = ArrayMinJump(arr);

        System.out.println("The minimum jump required to go to the end of the array: " + res);
    }

    public static int ArrayMinJump(int[] arr) {
        int n = arr.length;

        if(n <= 1){
            return 0;
        }

        if(arr[0] == 0){
            return -1;
        }

        int maxReach = arr[0];
        int steps = arr[0];
        int jump = 1;

        for(int i = 1;i<n;i++){
            // if you reached to the last position
            if(i == n-1){
                return jump;
            }

            // upadte the max reach
            maxReach = Math.max(maxReach, i + arr[i]);

            //Use a step to move forward
            steps--;

            // If no steps are left
            if (steps == 0) {
                // We must do another jump
                jump++;

                // Check if current position is beyond what we can reach
                if (i >= maxReach)
                    return -1;

                // Reinitialize the steps for the new jump
                steps = maxReach - i;
            }
        }
        
        return -1;
    }
}
