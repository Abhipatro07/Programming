/*
Test Cases for Find_maximum_difference_between_two_elements_such_that_larger_element_appears_after_smaller:

1️⃣ Input: [2, 3, 10, 6, 4, 8, 1]
    Expected Output: 8
    Explanation: Max difference = 10 - 2 = 8.

2️⃣ Input: [7, 9, 5, 6, 3, 2]
    Expected Output: 2
    Explanation: Max difference = 9 - 7 = 2.

3️⃣ Input: [10, 8, 6, 4, 2]
    Expected Output: -1
    Explanation: Array is in decreasing order → no element greater after smaller → difference = -1 (or 0 if you handle this case differently).

4️⃣ Input: [1, 2, 90, 10, 110]
    Expected Output: 109
    Explanation: Max difference = 110 - 1 = 109.

5️⃣ Input: [80, 2, 6, 3, 100]
    Expected Output: 98
    Explanation: Max difference = 100 - 2 = 98.

6️⃣ Input: [1, 1, 1, 1]
    Expected Output: 0
    Explanation: All equal → max difference = 0.

7️⃣ Input: [5, 4, 3, 2, 1]
    Expected Output: -1
    Explanation: Strictly decreasing → no valid pair.

8️⃣ Input: [4, 3, 10, 2, 9, 1, 15]
    Expected Output: 14
    Explanation: Max difference = 15 - 1 = 14.

9️⃣ Input: [1, 2, 3, 4, 5]
    Expected Output: 4
    Explanation: Max difference = 5 - 1 = 4.

🔟 Input: [10]
    Expected Output: 0
    Explanation: Single element → no pair possible → difference = 0.

11️⃣ Input: [2, 4, 1, 16, 7, 5, 11]
    Expected Output: 15
    Explanation: Max difference = 16 - 1 = 15.

12️⃣ Input: [3, 3, 3, 9, 3, 3]
    Expected Output: 6
    Explanation: Max difference = 9 - 3 = 6.

13️⃣ Input: [9, 7, 8, 5, 6, 10]
    Expected Output: 5
    Explanation: Max difference = 10 - 5 = 5.

14️⃣ Input: [1, 10, 1, 10, 1, 10]
    Expected Output: 9
    Explanation: Each rise gives 9 → max = 9.

15️⃣ Input: []
    Expected Output: 0
    Explanation: Empty array → no valid pair → difference = 0.
*/

package Arrays;

import java.util.Scanner;

public class Find_maximum_difference_between_two_elements_such_that_larger_element_appears_after_smaller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements into the array: ");
        int arr[] = new int[n];
        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        int maxDiff = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                int diff = arr[j] - arr[i];

                if(diff > maxDiff){
                    maxDiff = diff;
                }
            }
        }

        if (maxDiff <= 0) {
            System.out.println("The max difference is: -1");
        } else {
            System.out.println("The max difference is: " + maxDiff);
        }

    }
}
