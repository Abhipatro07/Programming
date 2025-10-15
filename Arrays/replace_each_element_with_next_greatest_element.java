/*
Test Cases for replace_each_element_with_next_greatest_element:

1. Input: [16, 17, 4, 3, 5, 2]
   Expected Output: [17, 5, 5, 5, 2, -1]
   Explanation: Each element is replaced by the next greatest element to its right. The last element becomes -1.

2. Input: [2, 3, 1, 9, 7]
   Expected Output: [9, 9, 9, 7, -1]
   Explanation:
   - Right of 2 → max is 9
   - Right of 3 → max is 9
   - Right of 1 → max is 9
   - Right of 9 → next greatest is 7
   - Right of 7 → none → -1

3. Input: [10, 20, 30, 40]
   Expected Output: [40, 40, 40, -1]
   Explanation: Increasing array → every element replaced by the last element except the last one.

4. Input: [40, 30, 20, 10]
   Expected Output: [30, 20, 10, -1]
   Explanation: Decreasing array → each element replaced by the next one.

5. Input: [5, 5, 5, 5]
   Expected Output: [5, 5, 5, -1]
   Explanation: Handles duplicates correctly.

6. Input: [1]
   Expected Output: [-1]
   Explanation: Single element → no next greatest.

7. Input: []
   Expected Output: []
   Explanation: Empty array → output empty.

8. Input: [7, 12, 9, 10, 15]
   Expected Output: [15, 15, 15, 15, -1]
   Explanation: Each element replaced with the largest element on its right.

9. Input: [4, 3, 2, 1, 5]
   Expected Output: [5, 5, 5, 5, -1]
   Explanation: All before 5 replaced by 5.

10. Input: [-3, -1, -7, -2, 0]
    Expected Output: [0, 0, 0, 0, -1]
    Explanation: Works correctly with negative numbers.
*/

package Arrays;

import java.util.Scanner;

public class replace_each_element_with_next_greatest_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the value into the array: ");
        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        if(n == 0){
            System.out.println("Output: []");
            return;
        }

        int maxFromRight = -1;

        for(int i = n-1;i>=0;i--){
            int temp = arr[i];
            arr[i] = maxFromRight;

            if(temp > maxFromRight){
                maxFromRight = temp;
            }
        }

        System.out.println("The Expected Output is: ");
        for(int num : arr){
            System.out.println(num);
        }

    }
}
