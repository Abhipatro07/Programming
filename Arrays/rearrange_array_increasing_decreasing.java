/*
Test Cases for rearrange_array_increasing_decreasing:

1. Input: [1, 2, 3, 4, 5]
   Expected Output: [1, 5, 2, 4, 3]
   Explanation: Start with smallest → largest → next smallest → next largest → remaining middle.

2. Input: [10, 20, 30, 40, 50, 60]
   Expected Output: [10, 60, 20, 50, 30, 40]
   Explanation: Alternately pick min and max from the remaining elements.

3. Input: [5, 1, 3, 2, 4]
   Expected Output: [1, 5, 2, 4, 3]
   Explanation: Sorted first: [1, 2, 3, 4, 5], then alternate min-max placement.

4. Input: [7, 7, 2, 2, 5]
   Expected Output: [2, 7, 2, 7, 5]
   Explanation: Handles duplicates correctly, alternates min-max.

5. Input: [1]
   Expected Output: [1]
   Explanation: Single element → output same as input.

6. Input: [2, 2, 2, 2]
   Expected Output: [2, 2, 2, 2]
   Explanation: All elements equal → output same as input.

7. Input: [10, -10, 20, -20, 0]
   Expected Output: [-20, 20, -10, 10, 0]
   Explanation: Handles negative numbers and zeros in min-max order.

8. Input: [3, 1, 4, 1, 5, 9, 2]
   Expected Output: [1, 9, 1, 5, 2, 4, 3]
   Explanation: Sort first: [1,1,2,3,4,5,9], then pick min, max alternately.

9. Input: [100, 50, 25, 75]
   Expected Output: [25, 100, 50, 75]
   Explanation: Sorted: [25,50,75,100] → arrange min-max alternately.

10. Input: []
    Expected Output: []
    Explanation: Empty array → output empty array.
*/

package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class rearrange_array_increasing_decreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();
        System.out.println("Enter the values into the array: ");
        int arr[] = new int[n];

        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        if(arr.length == 0){
            System.out.println("The give array is Empty");
        }

        if(arr.length == 1){
            System.out.println("The expectd Output is: " + arr[0]);
        }

        ArrayList<Integer> res = new ArrayList<>();

        Arrays.sort(arr); // Sort the array first

        int[] result = new int[n]; // Temporary array to store result
        int left = 0, right = n - 1;
        int index = 0;

        while(left < right){
            result[index++] = arr[left++];   // smallest
            result[index++] = arr[right--];  // largest
        }

        if(left == right){ // If odd number of elements, add the middle element
            result[index] = arr[left];
        }

        System.out.println("Expected Output is: ");
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}
