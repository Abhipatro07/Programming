/*
Test Cases for find_triplet_with_given_sum:

1. Input: arr = [1, 4, 45, 6, 10, 8], sum = 22  
   Expected Output: true  
   Explanation: Triplet (4, 8, 10) gives sum = 22.

2. Input: arr = [12, 3, 4, 1, 6, 9], sum = 24  
   Expected Output: true  
   Explanation: Triplet (12, 3, 9) gives sum = 24.

3. Input: arr = [1, 2, 3, 4, 5], sum = 9  
   Expected Output: true  
   Explanation: Triplet (2, 3, 4) gives sum = 9.

4. Input: arr = [1, 2, 3, 4, 5], sum = 50  
   Expected Output: false  
   Explanation: No such triplet exists.

5. Input: arr = [0, -1, 2, -3, 1], sum = -2  
   Expected Output: true  
   Explanation: Triplet (-3, 1, 0) gives sum = -2.

6. Input: arr = [5, 5, 5], sum = 15  
   Expected Output: true  
   Explanation: Only one triplet possible → (5, 5, 5).

7. Input: arr = [1, 1, 1, 2, 2], sum = 4  
   Expected Output: true  
   Explanation: Triplet (1, 1, 2) gives sum = 4.

8. Input: arr = [2, 4, 6, 8, 10], sum = 100  
   Expected Output: false  
   Explanation: No triplet sums up to 100.

9. Input: arr = [-2, 0, 1, 3], sum = 2  
   Expected Output: true  
   Explanation: Triplet (-2, 1, 3) gives sum = 2.

10. Input: arr = [1, 2, 3], sum = 6  
    Expected Output: true  
    Explanation: (1 + 2 + 3) = 6 → exact match.

11. Input: arr = [1, 2], sum = 3  
    Expected Output: false  
    Explanation: Less than 3 elements → no triplet possible.

12. Input: arr = [0, 0, 0, 0], sum = 0  
    Expected Output: true  
    Explanation: (0, 0, 0) forms valid triplet.

13. Input: arr = [], sum = 10  
    Expected Output: false  
    Explanation: Empty array → no triplet.

14. Input: arr = [-5, -1, -3, -4], sum = -9  
    Expected Output: true  
    Explanation: Triplet (-5, -1, -3) gives sum = -9.

15. Input: arr = [3, 7, 1, 2, 8, 4, 5], sum = 20  
    Expected Output: true  
    Explanation: (7, 8, 5) = 20.
*/

package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class find_triplet_with_given_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the target sum: ");
        int targetSum = sc.nextInt();
        
        if(hasTripletWithSum(arr, targetSum)) {
            System.out.println("Triplet with sum " + targetSum + " exists.");
        } else {
            System.out.println("No triplet with sum " + targetSum + " found.");
        }
    }
    
    public static boolean hasTripletWithSum(int[] arr, int sum) {
        Arrays.sort(arr); // Sort the array first

        for(int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;
            
            while(left < right) {
                int currentSum = arr[i] + arr[left] + arr[right];
                
                if(currentSum == sum) {
                    System.out.println("Triplet: (" + arr[i] + ", " + arr[left] + ", " + arr[right] + ")");
                    return true;
                } else if(currentSum < sum) {
                    left++; // Need a larger sum
                } else {
                    right--; // Need a smaller sum
                }
            }
        }
        
        return false; // No triplet found
    }
}
