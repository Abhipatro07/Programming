/*
Test Cases for find_leaders_in_array:

1. Input: [16, 17, 4, 3, 5, 2]
   Expected Output: [17, 5, 2]
   Explanation: 17 > 4,3,5,2; 5 > 2; 2 is last element.

2. Input: [10, 9, 8, 7, 6]
   Expected Output: [10, 9, 8, 7, 6]
   Explanation: Every element is greater than all to its right (strictly decreasing array).

3. Input: [1, 2, 3, 4, 5]
   Expected Output: [5]
   Explanation: Only last element is leader in an increasing array.

4. Input: [7, 10, 4, 10, 6, 5, 2]
   Expected Output: [10, 10, 6, 5, 2]
   Explanation: 10 (at index 1) > 4,10,6,5,2; second 10 > 6,5,2; and last three follow.

5. Input: [5, 5, 5, 5]
   Expected Output: [5, 5, 5, 5]
   Explanation: All elements are equal, each is leader.

6. Input: [100]
   Expected Output: [100]
   Explanation: Single element is always a leader.

7. Input: [0, -1, -2, -3]
   Expected Output: [0, -1, -2, -3]
   Explanation: Array is in decreasing order, all are leaders.

8. Input: [2, 3, 20, 15, 8, 3]
   Expected Output: [20, 15, 8, 3]
   Explanation: 20 > 15,8,3; 15 > 8,3; 8 > 3; 3 last.

9. Input: [10, 20, 30, 10, 5]
   Expected Output: [30, 10, 5]
   Explanation: 30 > 10,5; 10 > 5; 5 last.

10. Input: []
    Expected Output: []
    Explanation: Empty array → no leaders.
*/

package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class find_leaders_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the values to the array: ");
        for(int i = 0; i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> res = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for(int i = n-1;i>=0;i--){
            if (arr[i] >= max) {
                res.add(arr[i]);
                max = arr[i];
            }
        }

        System.out.println("Final output is: ");
        for(int i = res.size()-1;i>=0;i--){
            System.out.println(res.get(i));
        }
    }
}
